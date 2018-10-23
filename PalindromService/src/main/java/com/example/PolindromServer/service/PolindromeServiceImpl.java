package com.example.PolindromServer.service;

import org.springframework.stereotype.Service;

@Service
public class PolindromeServiceImpl implements PolindromeService {

    public boolean isPolindrome(String str) {
        final int lenght = str.length();
        for (int i = 0; i < lenght / 2; i++) {
            char curChar = str.charAt(i);
            char checkedChar = str.charAt(lenght - i - 1);
            if (curChar != checkedChar) {
                return false;
            }
        }
        return true;
    }

}
