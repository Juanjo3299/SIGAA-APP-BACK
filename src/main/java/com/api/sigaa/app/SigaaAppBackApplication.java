package com.api.sigaa.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SigaaAppBackApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SigaaAppBackApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/oauth/token").allowedOrigins("http://localhost:4200");
            }
        };
    }

    @Override
    public void run(String... args) throws Exception {
    }

}
