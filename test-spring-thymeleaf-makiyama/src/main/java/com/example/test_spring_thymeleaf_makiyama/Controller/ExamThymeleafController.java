package com.example.test_spring_thymeleaf_makiyama.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_thymeleaf_makiyama.domain.Member;

@Controller
@RequestMapping("/Exam")

public class ExamThymeleafController {

    @RequestMapping("")
    public String index(Model model){
        model.addAttribute("member", new Member());
        return "ex-thymeleaf-input";
    }
    @RequestMapping("/register")
    public String register(Member member,Model model){
        model.addAttribute("member", member);
        return "ex-thymeleaf-result";
    }
}
