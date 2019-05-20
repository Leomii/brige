package com.leomii.auto.loan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Boot 入口
 *
 * @author leomii
 */
@SpringBootApplication
@Configuration
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}