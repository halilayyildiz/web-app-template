package com.siemens.spectrum.om.integration.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.siemens.spectrum.om.integration.UserRepository;

@Controller
public class HomeController
{
	@Autowired
	UserRepository userRepo;

	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("users", userRepo.findAll());
		return "index";
	}
}
