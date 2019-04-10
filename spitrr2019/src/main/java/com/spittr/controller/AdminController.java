package com.spittr.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spittr.domain.Spitter;
import com.spittr.spitter.JpaSpitterRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private JpaSpitterRepository spitterRepository;

	@RequestMapping("")
	String admin(Model m) {
		m.addAttribute("spitter",new Spitter());
		List<Spitter> spitters=spitterRepository.findAll();
		m.addAttribute("spitters", spitters);
		return "admin/adminPage";
	}
	
	@RequestMapping(value="/addSpitter",method=RequestMethod.POST)
	String addSpitter(@RequestBody List<Spitter>  spitters) {
		
		System.out.println("do........");
     for(Spitter spitter:spitters)
		spitterRepository.save(spitter);
		
		return "redirect:/admin";
	}
	
	@RequestMapping(value="/deleteSpitter{id}")
	String deletSpitter(@PathParam(value = "id") int id) {
		
		spitterRepository.deleteById(id);
		return "redirect:/admin";
	}
}
