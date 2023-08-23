package com.example.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Menu;

@FeignClient(value ="Gateway-Service",url="http://localhost:9090" )
public interface MenuFeignClient {
	@GetMapping("/menu")
	public List<Menu>getMenu();
	
	@GetMapping("/menu/{id}")
	public Menu getMenu(@PathVariable int  id);
	
}
