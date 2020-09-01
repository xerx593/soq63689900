package com.stackoverflow.q63689900;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("${foo}.properties")
public class Q63689900Application {

    @Value("${text}")
    private String text;
    private static final Logger LOG = LoggerFactory.getLogger(Q63689900Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Q63689900Application.class, args);
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            LOG.info("Text: {}", text);
        };
    }
}
