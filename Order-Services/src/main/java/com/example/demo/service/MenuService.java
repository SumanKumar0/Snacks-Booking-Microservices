package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.client.MenuFeignClient;
import com.example.demo.model.Menu;

@Service
public class MenuService {
	@Autowired
	MenuFeignClient menuFeignClient;
	
	public List<Menu>getMenu(){
		return menuFeignClient.getMenu();
	}
	
	
	public Menu getMenu(int  id) {
		return menuFeignClient.getMenu(id);
		
	}

}
