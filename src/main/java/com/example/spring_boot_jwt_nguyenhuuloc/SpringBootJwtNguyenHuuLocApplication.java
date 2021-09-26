package com.example.spring_boot_jwt_nguyenhuuloc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootJwtNguyenHuuLocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJwtNguyenHuuLocApplication.class, args);
    }

}
