package com.ggoreb.basic.controller;

import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DownloadController {

	@GetMapping("/download")
	public ResponseEntity<Resource> download() throws Exception {
		File file = new File("C:\\Users\\정찬오\\Pictures/JobApplying.jpg");//실제 파일 위치 \\ or / 사용할것
		InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
		return ResponseEntity.ok()//본래 response 할때 파일형식으로 반환하는데 string이던 파일이던 상관없이 반환하도록 사용하는 함수
						.header("content-disposition", //browser에서는 이와 같은 헤더가 있으면 파일을 다운로드 하도록 정해진 규칙
								"filename=" + URLEncoder.encode(file.getName(), "utf-8"))
																	//.getName("원하는 이름")을 통해 다운로드하는 파일의 이름을 바꿀 수 있음.
				    .contentLength(file.length())//다운로드 현황을 보여줄때 사용하는 함수
				    // content-type => mime-type을 검색하여 어떤 내용이 들어갈지 알 수 있음(image/jpeg,text/plain 등등...
				    .contentType(MediaType.parseMediaType("image/jpeg"))//application/octet-stream 을 넣어주면바로 다운로드실행
				    .body(resource);//,resource가 response로 반환하게 됨!
	}
	
}
