package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Menu;
import com.example.demo.service.MenuService;



@RestController
@RequestMapping("/order")
public class OrderController {
@Autowired
MenuService menuService;
	@GetMapping("/menu")
	public List<Menu>getMenu()
	{
		return menuService.getMenu();
	}
	@GetMapping("/menu/{id}")
	public Menu getMenu(@PathVariable int  id)
	{
		return menuService.getMenu(id);
	}
	@GetMapping("/hello")
	public String testHello()
	{
		return "hello";
	}
}
