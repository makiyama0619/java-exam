package com.example.test_spring_scope_makiyama.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_scope_makiyama.Form.exam01Form;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/exam01")

public class Exam01Controller {

	@ModelAttribute
	public exam01Form setUpForm() {
		return new exam01Form();
	}

	@RequestMapping("")
	public String index() {
		return "exam01";
	}

	@RequestMapping("/receive-info")
	public String receiveinfo(exam01Form form, Model model) {
		if ("yamada@sample.com".equals(form.getEmail()) && "yamayama".equals(form.getPass())) {
			model.addAttribute("result", "成功");
		} else {
			model.addAttribute("result", "失敗");
		}
		return "exam01-result";
	}
}
