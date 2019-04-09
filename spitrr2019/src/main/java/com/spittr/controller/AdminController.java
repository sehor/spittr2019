package com.spittr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spittr.domain.Spitter;
import com.spittr.spitter.JpaSpitterRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private JpaSpitterRepository spitterRepository;

	@RequestMapping("")
	String admin(Model m) {
		List<Spitter> spitters=spitterRepository.findAll();
		m.addAttribute("spitters", spitters);
		return "admin/adminPage";
	}
}
