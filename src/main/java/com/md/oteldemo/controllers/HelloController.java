package com.md.oteldemo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public ResponseEntity<String> getHello(@RequestParam(value = "name", defaultValue = "world") String name) {
        try {
            Thread.sleep(1000);
            return ResponseEntity.ok(String.format("hello, %s!", name));
        } catch (InterruptedException e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
