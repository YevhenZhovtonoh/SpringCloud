package com.example.ui;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PalindromeController {


    private final PalindromeClient palindromeClient;

    @Autowired
    public PalindromeController(PalindromeClient palindromeClient) {
        this.palindromeClient = palindromeClient;
    }

    @GetMapping("/isPalindrome")
    public String greeting(@RequestParam(required=false, defaultValue="Empty String") String str, Model model) {
        model.addAttribute("str", str);
        model.addAttribute("result", palindromeClient.getResult(str) );
        return "page";
    }

}
