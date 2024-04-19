package com.aber.crp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aber.crp.dto.PostDto;
import com.aber.crp.dto.UserDto;
import com.aber.crp.service.UserService;
import com.aber.crp.util.Utils;

@Controller
@RequestMapping("/user/profile")
public class ProfilePageController {
	
	@Autowired
	private UserService userService;	

	@GetMapping
	public String loadProfilePage(Model model) {
		
		UserDto userdto = userService.findByUserName(Utils.getCurrentUserName());
		
		if(userdto == null) {
			return "login";
		}
		model.addAttribute("user", userdto);
		return "user/profile";
	}
	
	@PostMapping
	public String submitProfilePage() {
		return "user/profile";
	}
	
	@PostMapping("/delete")
	public String deleteAccount() {
		UserDto userdto = userService.findByUserName(Utils.getCurrentUserName());
		userService.deleteAccount(userdto.getId());
		return "redirect:/login";
	}
	
	@PostMapping("/updatePassword")
	public String updatePassword(@ModelAttribute("user") UserDto user) {
		userService.updatePassword(user.getPassword1());
		return "redirect:/login";
	}

}
