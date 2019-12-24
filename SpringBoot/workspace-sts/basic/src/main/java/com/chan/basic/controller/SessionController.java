package com.chan.basic.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.chan.basic.model.User;

@Controller
public class SessionController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String loginPost(User user, // modelAttribue("user"
			HttpSession session) { //HttpSession : 세션은 어디서든지(현재 스프링 서버) 사용 가능
		//웹의 모든 seesion은 httpSession으로 선언한 변수에 저장됨
		session.setAttribute("user", user);
		return "redirect:/main";
		//지정된 주소로 이동(떠넘김) /main으로 바로!
	}

	@GetMapping("/main")
	public String main() {
		return "main";
	}
}