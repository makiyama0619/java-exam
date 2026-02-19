package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {

    
    List<Member> list = repository.findAll();
    System.out.println("-手順1-");
    for (Member m : list) {
        System.out.println("ID：" + m.getId() + "、名前：" + m.getName() +
                           "、年齢：" + m.getAge() + "、部署ID：" + m.getDepId());
    }


    Member m2 = repository.load(2);
    System.out.println("-手順2-");
    System.out.println("ID：" + m2.getId() + "、名前：" + m2.getName() +
                       "、年齢：" + m2.getAge() + "、部署ID：" + m2.getDepId());


    Member newMember = new Member();
    newMember.setName("牧山純");
    newMember.setAge(27);
    newMember.setDepId(3);
    repository.save(newMember);


    Member updateMember = new Member();
    updateMember.setId(2);
    updateMember.setName("シロー");
    updateMember.setAge(32);
    updateMember.setDepId(2);
    repository.save(updateMember);

	
	return "member";
	}
}
