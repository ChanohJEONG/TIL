package com.ggoreb.basic.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.ggoreb.basic.model.FileInfo;

@Controller
public class UploadController {
	@GetMapping("/upload1")
	public String upload1() {
		return "upload1";
	}

	@PostMapping("/upload1")
	@ResponseBody
	public String upload1Post(MultipartHttpServletRequest mRequest) {
		String result = "";

		List<MultipartFile> mFiles = mRequest.getFiles("file");// 리스트 형식으로 파일저장->여러개 파일 저장가능
		// 동일한 이름의 파일을 업로드했을때 1개씩밖에 안돼지만 위와같이 하면 가능
		for (int i = 0; i < mFiles.size(); i++) {
			
			// 업로드된파일정보가 다 들어가 있음
			MultipartFile mFile = mFiles.get(i);// file 이란 이름으로 업로드한 file을 mFile에저장
			// 지정 경로에 지정 파일명으로 저장해줌
			String oName = mFile.getOriginalFilename();// 저장한 파일의 본래 이름을 가져와 String으로 저장
//		mFile.transferTo(new File("c:/dev/" + oName));//지정 경로에 oName으로 저장하라는 뜻! ->이 구문을 try catch구문으로 예외처리
			result += oName + "\n";
			
			try {
				mFile.transferTo(new File("c:/dev/" + oName));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 지정 경로에 oName으로 저장하라는 뜻!
		}


		return result;
	}

	@GetMapping("/upload2")
	public String upload2() {
		return "upload2";
	}

	@PostMapping("/upload2")
	@ResponseBody
	public String upload2Post(@RequestParam("file") MultipartFile mFile) {
		String result = "";

		String oName = mFile.getOriginalFilename();
		result += oName + "\n";

		return result;
	}

	@GetMapping("/upload3")
	public String upload3() {
		return "upload3";
	}

	@PostMapping("/upload3")
	@ResponseBody
	public String upload3Post(@ModelAttribute FileInfo info) {
		String result = "";

		String oName = info.getFile().getOriginalFilename();
		result += oName + "\n";

		return result;
	}
}
