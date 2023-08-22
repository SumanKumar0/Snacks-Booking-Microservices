package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Menu;
import com.example.demo.service.MenuService;

@RestController

public class MenuController {
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
	@PostMapping("/menu")
	public List<Menu> saveMenu(@RequestBody List<Menu> menu)
	{
		return menuService.saveMenu(menu);
	}
	@PutMapping("/menu")
	public Menu updateMenu(@RequestBody Menu menu)
	{
		return menuService.updateMenu(menu);
	}
	@DeleteMapping("/menu/{id}")
	public String removeMenu(@PathVariable int id)
	{
		return menuService.removeMenu(id);
	}
}
