package com.springBootDataJPADemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
/*import org.springframework.web.bind.annotation.ResponseBody;*/
import org.springframework.web.bind.annotation.ResponseBody;

import com.springBootDataJPADemo.dao.AlienDao;
import com.springBootDataJPADemo.model.Alien;

@Controller
public class HomeController {
	@Autowired
	AlienDao alienDao;
	@GetMapping("/")
	/* @ResponseBody */
	private String home() {
		return "index";
	}
	@PostMapping("/addAlien")
	@ResponseBody
	private String addAlien(@ModelAttribute("alien") Alien a){
		alienDao.save(a);
		return "Add successfully...";
	}
	
	@GetMapping("/getAlien/{aid}")
	@ResponseBody
	private Optional<Alien> getAlien(@PathVariable("aid") int aid,ModelMap modelMap) {
		Optional<Alien> alien=alienDao.findById(aid);
		/* modelMap.addAttribute("alien",alien); */
;		return alien;
	}
}
