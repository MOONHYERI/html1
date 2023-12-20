package com.example.html2.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class htmlController {

    @GetMapping("/header")
    public String htmlController1(){
        return "header";
    }
    @GetMapping("/footer")
    public String htmlController2(){
        return "footer";
    }
    @GetMapping("/home")
    public String htmlController3(){
        return "home";
    }
    @GetMapping("/me")
    public String htmlController4(){ return "me";}
    @GetMapping("/team")
    public String htmlController5(){ return "team";}
}
