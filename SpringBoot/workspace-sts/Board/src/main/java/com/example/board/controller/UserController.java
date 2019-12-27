package com.example.board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.board.model.User;
import com.example.board.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepository;

	@Autowired
	HttpSession session;

	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}// ->signup.html로 접속하게 됨

	@PostMapping("/signup")
	public String signupPost(@ModelAttribute User user) {
		userRepository.save(user);
		return "redirect:/";
	}

	@GetMapping("/signin")
	public String signin() {
		return "signin";
	}

	@PostMapping("/signin")
	public String signinPost(@ModelAttribute User user) { // ?뒤에 붙는 파라미터와 같은 내용을 받아줌
		User dbUser = userRepository.findByEmailAndPwd(user.getEmail(), user.getPwd());
		// 입력받은 user정보를 userRepository에 가서 확인해보라는 명령어임, 위의 명령어는 email과 pwd정보를 이용하여
		// DB를찾으라는 뜻,
		// 이용정보는 user모델에 반드시 만들어진 변수여야 함(동일한 이름)
		if (dbUser != null) {// 값이 있다는 것은 입력받은 내용이 DB에 있다는 뜻이므로 아래와 같이 명령어 실행
			session.setAttribute("user_info", dbUser);
		} // 클라이언트가 서버에 접속할때마다 각각 session이 할당됨 즉 접속할때마다 session이 할당됨
		return "redirect:/";
	}

	@GetMapping("/signout")
	public String signout() {
		session.invalidate();
		return "redirect:/";
	}

}