package com.chan.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@GetMapping("/Login") // 브라우저에서 get방식으로 접근시 login.html을 보여줌
	public String login() {
		return "login";
	}

	@PostMapping("/Login") // post방식으로 접근시 (ResponseBody를 통해)JSON파일 가져와 보여줌
	@ResponseBody
	public String loginPost(@RequestParam("id") String id, // requestParam방식; 정확히 키 입력해야함
			@RequestParam("pw") String pw) {

		String dbId = "boot";
		String dbPw = "1234";

		if (dbId.equals(id) && dbPw.equals(pw)) {
			return "로그인 성공";
		}
		return "로그인 실패";
	}

}