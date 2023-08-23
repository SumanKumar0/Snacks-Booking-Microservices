package com.example.demo.service;

import com.example.demo.model.OrderBooking;

import java.util.List;
import java.util.Map;

import com.example.demo.model.Menu;
import com.example.demo.model.OrderResponse;

public interface OrderService {
	public String makeOrder(OrderBooking orderBooking);
	
	

	public OrderResponse createOrderResponse(int id);
	public List<OrderResponse >createOrderResponse();
	
}
