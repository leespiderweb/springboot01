package com.xxx.config.second;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/*
 *
 *@author EUE
 *@date 2022/12/1 13:14
 */
@Configuration
@MapperScan(basePackages = SecondDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "secondSqlSessionFactory")
public class SecondDataSourceConfig {
    // 精确到 second 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.xxx.seconddao";
    static final String MAPPER_LOCATION = "classpath:mappers/second/*.xml";

    @Value("${second.datasource.url}")
    private String url;

    @Value("${second.datasource.username}")
    private String user;

    @Value("${second.datasource.password}")
    private String password;

    @Value("${second.datasource.driverClassName}")
    private String driverClass;

    @Bean(name = "secondDataSource")
    public DataSource secondDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "secondTransactionManager")
    public DataSourceTransactionManager secondTransactionManager() {
        return new DataSourceTransactionManager(secondDataSource());
    }

    @Bean(name = "secondSqlSessionFactory")
    public SqlSessionFactory secondSqlSessionFactory(@Qualifier("secondDataSource") DataSource secondDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(secondDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(SecondDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
