package com.example.html2.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class htmlController {

    @GetMapping("/header")
    public String htmlController1(Model model) {
        return "header";
    }

    @GetMapping("/footer")
    public String htmlController2(Model model) {
        return "footer";
    }

    @GetMapping("/home")
    public String htmlController3(Model model) {
        return "home";
    }

    @GetMapping("/me")
    public String htmlController4(Model model) {
        return "me";
    }

    @GetMapping("/team")
    public String htmlController5(Model model) {
        return "team";
    }

    @GetMapping("/location")
    public String htmlController6(Model model) {
        return "location";
    }

    @GetMapping("/boardinfo")
    public String htmlController7(Model model) {
        return "boardinfo";
    }

    @GetMapping("/board1")
    public String htmlController8(Model model) {
        return "board1";
    }

    @GetMapping("/board")
    public String htmlController9(Model model) {
        return "board";
    }

    @GetMapping("/login")
    public String htmlController10(Model model) {
        return "login";
    }

    @GetMapping("/join")
    public String htmlController11(Model model) {
        return "join";
    }

    @GetMapping("/editmy")
    public String htmlController12(Model model) {
        return "editmy";
    }

    @GetMapping("/boardwrite")
    public String htmlController14(Model model) {
        return "boardwrite";
    }

    @GetMapping("/boardwrite1")
    public String htmlController15(Model model) {
        return "boardwrite1";
    }

    @GetMapping("/map")
    public String htmlContorller16(Model model) {
        return "map";
    }
    @GetMapping("/updateorigin")
    public String htmlController17(Model model){
        return "updateorigin";
    }
}
