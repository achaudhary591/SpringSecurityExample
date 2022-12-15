package com.workshop.akshay.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/greetings")
public class GreetingsController {

    @GetMapping("/say-hello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hi how are you , this is a hello from API");
    }

    @GetMapping("/say-goodbye")
    public ResponseEntity<String> sayGoodbye(){
        return ResponseEntity.ok("Hi how are you , this is a Goodbye from API");
    }
}
