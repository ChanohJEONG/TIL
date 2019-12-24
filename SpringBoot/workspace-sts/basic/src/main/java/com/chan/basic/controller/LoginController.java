package com.chan.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@GetMapping("/Login") // ���������� get������� ���ٽ� login.html�� ������
	public String login() {
		return "login";
	}

	@PostMapping("/Login") // post������� ���ٽ� (ResponseBody�� ����)JSON���� ������ ������
	@ResponseBody
	public String loginPost(@RequestParam("id") String id, // requestParam���; ��Ȯ�� Ű �Է��ؾ���
			@RequestParam("pw") String pw) {

		String dbId = "boot";
		String dbPw = "1234";

		if (dbId.equals(id) && dbPw.equals(pw)) {
			return "�α��� ����";
		}
		return "�α��� ����";
	}

}