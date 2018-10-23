package com.example.ui;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="Palindrome", fallback = HystrixClientFallback.class )
public interface PalindromeClient {

    @RequestMapping(method = RequestMethod.GET, value = "/palindrome", consumes = "application/json")
String getResult(@RequestParam("input") String result);


}