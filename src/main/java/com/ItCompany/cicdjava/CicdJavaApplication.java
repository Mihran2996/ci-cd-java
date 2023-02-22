package com.ItCompany.cicdjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdJavaApplication.class, args);
    }

    @GetMapping("/welcome")
    public String message() {
        return "Welcome to java!";
    }

}
