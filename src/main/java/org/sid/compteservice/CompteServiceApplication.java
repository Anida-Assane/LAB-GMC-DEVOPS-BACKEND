package org.sid.compteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CompteServiceApplication {
    @RequestMapping("/")
    public String home(){
        return "hello world";
    }
    public static void main(String[] args) {
        SpringApplication.run(CompteServiceApplication.class, args);
    }

}
