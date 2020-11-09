package org.study.integration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * <p>
 *     启动类
 *     springboot部署在外部tomcat上时，启动类需要继承SpringBootServletInitializer
 * </p>
 *
 * @author: Lcc
 * @version 1.0
 * @date: 2020/11/5
 */
@SpringBootApplication
@MapperScan(value = "org.study.integration.mapper")
public class IntegrationApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(IntegrationApplication.class, args);
    }

}
