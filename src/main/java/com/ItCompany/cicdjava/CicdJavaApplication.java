package com.ItCompany.cicdjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

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

    @GetMapping("/time")
    public String time() {
        return LocalDateTime.now().toString();
    }

    @GetMapping("/location")
    public String location() {
        return "Armenia/Gyumri";
    }

}
