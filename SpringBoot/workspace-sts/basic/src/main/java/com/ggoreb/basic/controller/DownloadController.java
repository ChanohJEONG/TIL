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
		File file = new File("C:\\Users\\������\\Pictures/JobApplying.jpg");//���� ���� ��ġ \\ or / ����Ұ�
		InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
		return ResponseEntity.ok()//���� response �Ҷ� ������������ ��ȯ�ϴµ� string�̴� �����̴� ������� ��ȯ�ϵ��� ����ϴ� �Լ�
						.header("content-disposition", //browser������ �̿� ���� ����� ������ ������ �ٿ�ε� �ϵ��� ������ ��Ģ
								"filename=" + URLEncoder.encode(file.getName(), "utf-8"))
																	//.getName("���ϴ� �̸�")�� ���� �ٿ�ε��ϴ� ������ �̸��� �ٲ� �� ����.
				    .contentLength(file.length())//�ٿ�ε� ��Ȳ�� �����ٶ� ����ϴ� �Լ�
				    // content-type => mime-type�� �˻��Ͽ� � ������ ���� �� �� ����(image/jpeg,text/plain ���...
				    .contentType(MediaType.parseMediaType("image/jpeg"))//application/octet-stream �� �־��ָ�ٷ� �ٿ�ε����
				    .body(resource);//,resource�� response�� ��ȯ�ϰ� ��!
	}
	
}
