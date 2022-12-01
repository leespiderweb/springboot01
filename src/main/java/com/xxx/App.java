package com.xxx;


import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@MapperScan( basePackages = {"com.xxx.dao","com.xxx.seconddao"})
public class App extends SpringBootServletInitializer
{
    private  static Logger logger  = LoggerFactory.getLogger(App.class);


    public static void main( String[] args )
    {
        logger.info("spring boot 启动了");

        SpringApplication.run(App.class);

        logger.info("这是info信息");

    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(App.class)  ;
    }
}
