package com.chan.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Snippet {
	@GetMapping("/linkUrl")
	public String linkUrl(Model model, @RequestParam(defaultValue="1") int now_page) {
		int start = (now_page -1) / 10 * 10 +1; //
		int end = start + 9; //보여주고자 하는 갯수(9)
		model.addAttribute("start", start);
		model.addAttribute("end", end);
		model.addAttribute("now_page", now_page);
		
		return "linkUrl";
	}
	
	@GetMapping("pagination")
	public String pagination(Model model, @RequestParam(defaultValue = "1") int page) {
		int startPage = (page - 1) / 10 * 10 + 1;
		int endPage = startPage + 9;
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("page", page);
		return "pagination";
	}

}
