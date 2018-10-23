package com.example.PolindromServer.controller;

import com.example.PolindromServer.service.PolindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PalindromeController implements PalindromControllerApi {


    private final PolindromeService polindromeService;

    @Autowired
    public PalindromeController(PolindromeService polindromeService) {
        this.polindromeService = polindromeService;
    }

    public ResponseEntity<Boolean> isPalindrome(@RequestParam String input) {
        return ResponseEntity.ok(polindromeService.isPolindrome(input));
    }
}
