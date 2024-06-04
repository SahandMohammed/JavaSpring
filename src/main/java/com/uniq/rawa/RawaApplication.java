package com.uniq.rawa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RawaApplication {
    public String message() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(RawaApplication.class, args);
    }

    RawaApplication obj = new RawaApplication();

    public int sum(int a, int b) {
        return a + b;
    }
}
