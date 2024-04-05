package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/index")
    public String index(Model model){
        int a = 10, b = 55, c = a * b;

        model.addAttribute("result", c);
        return "index";
    }

    @GetMapping("/page1")
    public void access1() {
        System.out.println("Hi this is page 1!");
    }

    @GetMapping("/page2")
    public void access2() {
        System.out.println("Hi this is page 2!");
    }

    @GetMapping("/page3")
    public void access3() {
        System.out.println("Hi this is page 3!");
    }
}