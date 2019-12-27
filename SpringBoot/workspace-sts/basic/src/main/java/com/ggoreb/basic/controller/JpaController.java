package com.ggoreb.basic.controller;

import java.util.List;

import javax.persistence.NonUniqueResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ggoreb.basic.model.Product;
import com.ggoreb.basic.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class JpaController {
	@Autowired // 자동으로 메모리에 만들어져있는 ProductRepository를 불러옴=>IOc/DI
	// spring이 알고있는 내용은 다 가져올 수 있음!
	// Product p = new Product(); 원래는 이렇게 클래스를 불러와야하는데 AutoWired덕분에 따로 선언할 필요
	// 없이아래와같이 가져옴
	ProductRepository productRepository;

	@GetMapping("/jpa/product2")
	public Product product2(String name) {
		Product list = null;
		try {
			list = productRepository.findByName(name);
		} catch (NonUniqueResultException e) {
			list = new Product();
			list.setName("오류!!!");
		}
		return list;
	} // 예외처리상황 : 동일한 이름이 들어가 있을 경우 -> return을 list형식으로 둘다 출력하거나 위와같이 try catch

	@GetMapping("/jpa/product3")
	public List<Product> product3(String name) {
		List<Product> list = productRepository.findAllByName(name);
		return list;
	} // 

	@GetMapping("/jpa/product")
	public List<Product> product() {
		List<Product> list = productRepository.findAll();
		return list;
	}

	@PostMapping("/jpa/product")
	public String productPost(@ModelAttribute Product product) {
		Product pro = productRepository.save(product);
		log.error(pro.toString());
		return "redirect:/jpa/product";
	}
}