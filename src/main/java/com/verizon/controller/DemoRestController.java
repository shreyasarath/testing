package com.verizon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.model.Book;

@RestController
public class DemoRestController {

	@GetMapping("/hello")
	public String helloAction() {
		return "Hello Everyone";
	}

	@GetMapping("/sampleBook")
	public Book sampleBookAction() {
		Book book = new Book();
		book.setBcode(111);
		book.setCategory("sample");
		book.setTitle("Sample Book");
		book.setPrice(6598);
		book.setType("sample type");
		return book;
	}
}
