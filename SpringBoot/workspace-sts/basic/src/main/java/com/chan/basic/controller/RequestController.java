package com.chan.basic.controller;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.chan.basic.model.Member;

@RestController
public class RequestController {
	@GetMapping("req/http")
	public String http(HttpServletRequest request) {
		String name = request.getParameter("name");
		String pageNum = request.getParameter("pageNum");
		return name + ", " + pageNum;
	}

	@GetMapping("req/param1")
	public String param1(@RequestParam("key1") String key1, @RequestParam("key2") String key2) {
		return key1 + ", " + key2;
	}//localhost8000/req/param1?key1=v1&key2=v2

	@GetMapping("req/param2")
	public String param2(@RequestParam Map<String, Object> map) {
		return map.toString();
	}//.../param2?search=java&version=1.8 ->JSON형식으로 출력

	@GetMapping("req/path/{path1}/{path2}")
	public String path(@PathVariable("path1") String path1, @PathVariable("path2") String path2) {
		return path1 + ", " + path2;
	}// ...req/path/입력된path1값/입력된path2값

	@GetMapping("req/model")
	public String model(@ModelAttribute Member member) {
		return member.toString();
	}// member변수 사용했음-> 

}