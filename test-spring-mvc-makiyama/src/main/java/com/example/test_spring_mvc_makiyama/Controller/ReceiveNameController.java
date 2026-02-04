package com.example.test_spring_mvc_makiyama.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_mvc_makiyama.form.ReceiveNameForm;

@Controller
@RequestMapping("/nameform")

public class ReceiveNameController {

    @ModelAttribute
    public ReceiveNameForm setUpForm() {
        return new ReceiveNameForm();
    }

    @RequestMapping("")
    public String index(){
        return "name-form";
    }
    @RequestMapping("/login")
	public String login(ReceiveNameForm form) {
        System.out.println("入力された値は" + form.getName() + "です。");
		return "finished";
    }


}
