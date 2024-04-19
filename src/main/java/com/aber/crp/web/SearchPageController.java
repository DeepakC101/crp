package com.aber.crp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aber.crp.dto.PostDto;
import com.aber.crp.service.PostService;

@Controller
@RequestMapping("/user/search")
public class SearchPageController {
	

	@Autowired
	PostService postService;
	

	@GetMapping
	public String loadSearchPage(Model model) {
		List<PostDto> postDtoList = postService.findAllPost();
		model.addAttribute("postList", postDtoList);
		return "user/search";
	}
	
	@PostMapping
	public String submitSearchPage() {
		return "user/search";
	}

}
