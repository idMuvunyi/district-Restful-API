package com.idrissa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
@GetMapping("/api/v1/listing")
    public GreetingFn greeting() {
        return new GreetingFn("Hello spring boot");
    }

//    record GreetingFn(String greeting){}

    class GreetingFn{
        private final String greeting;

        GreetingFn(String greeting) {
            this.greeting = greeting;
        }

        public String getGreeting() {
            return greeting;
        }

        @Override
        public String toString() {
            return "GreetingFn{" +
                    "greeting='" + greeting + '\'' +
                    '}';
        }


    }
}
