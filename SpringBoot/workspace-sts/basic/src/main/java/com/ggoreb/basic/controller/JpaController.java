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
	@Autowired // �ڵ����� �޸𸮿� ��������ִ� ProductRepository�� �ҷ���=>IOc/DI
	// spring�� �˰��ִ� ������ �� ������ �� ����!
	// Product p = new Product(); ������ �̷��� Ŭ������ �ҷ��;��ϴµ� AutoWired���п� ���� ������ �ʿ�
	// ���̾Ʒ��Ͱ��� ������
	ProductRepository productRepository;

	@GetMapping("/jpa/product2")
	public Product product2(String name) {
		Product list = null;
		try {
			list = productRepository.findByName(name);
		} catch (NonUniqueResultException e) {
			list = new Product();
			list.setName("����!!!");
		}
		return list;
	} // ����ó����Ȳ : ������ �̸��� �� ���� ��� -> return�� list�������� �Ѵ� ����ϰų� ���Ͱ��� try catch

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