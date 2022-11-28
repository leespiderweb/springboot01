package com.xxx;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    private  static Logger logger  = LoggerFactory.getLogger(App.class);


    public static void main( String[] args )
    {

        SpringApplication.run(App.class);

        logger.info("这是info信息");

    }
}
