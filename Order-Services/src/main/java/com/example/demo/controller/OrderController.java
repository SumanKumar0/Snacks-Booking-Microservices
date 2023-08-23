package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Menu;
import com.example.demo.model.OrderBooking;
import com.example.demo.model.OrderResponse;
import com.example.demo.service.MenuService;
import com.example.demo.service.OrderService;



@RestController
@RequestMapping("/order")
public class OrderController {
@Autowired
MenuService menuService;
@Autowired
OrderService orderService;

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
	@PostMapping("/makeOrder")
	public String makeOrder(@RequestBody OrderBooking orderBooking)
	{
		return orderService.makeOrder(orderBooking);
	}
	@GetMapping("/")
	public List<OrderResponse> getOrder()
	{
		return orderService.createOrderResponse();
	}
	@GetMapping("/{id}")
	public OrderResponse getOrder(@PathVariable int id)
	{
		return orderService.createOrderResponse(id);
	}
}
