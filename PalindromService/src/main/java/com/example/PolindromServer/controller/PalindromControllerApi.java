package com.example.PolindromServer.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface PalindromControllerApi {

    @GetMapping(value = "/palindrome",produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Boolean> isPalindrome(@RequestParam final String input);

}
