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
			HttpSession session) { //HttpSession : ������ ��𼭵���(���� ������ ����) ��� ����
		//���� ��� seesion�� httpSession���� ������ ������ �����
		session.setAttribute("user", user);
		return "redirect:/main";
		//������ �ּҷ� �̵�(���ѱ�) /main���� �ٷ�!
	}

	@GetMapping("/main")
	public String main() {
		return "main";
	}
}