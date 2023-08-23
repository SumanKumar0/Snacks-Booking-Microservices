package com.example.demo.model;

import java.util.List;

public class OrderBooking {

	private List<OrderRequest> orderRequest;

	public List<OrderRequest> getOrderRequest() {
		return orderRequest;
	}

	public void setOrderRequest(List<OrderRequest> orderRequest) {
		this.orderRequest = orderRequest;
	}

	public OrderBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OrderBooking [orderRequest=" + orderRequest + "]";
	}

}
