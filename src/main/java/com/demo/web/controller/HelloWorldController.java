package com.demo.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value = { "/hello", "hello/{name}" }, method = RequestMethod.GET)
	public @ResponseBody String hello(@PathVariable(required = false) String name) {
		String result = "Hello ";
		if (name != null && !name.trim().equals("")) {
			result += name;
		} else {
			result += "World";
		}
		return result;
	}
}
