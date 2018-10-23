package com.example.ui;

import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements PalindromeClient {

    @Override
    public String getResult(String result) {
        return  "Service doesn't work now";
    }
}