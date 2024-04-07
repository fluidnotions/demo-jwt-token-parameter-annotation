package com.example.demo;


import com.fluidnotions.jwttokenparameterannotation.JwtTokenHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    final Logger log = LoggerFactory.getLogger("demo");

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public record MyClaims(String sub, String name, long iat) {}


    @GetMapping("/hello")
    public String hello(@JwtTokenHeader(MyClaims.class) MyClaims claims) {
        log.info("claims: {}", claims);
        return "Hello, World!";
    }

}
