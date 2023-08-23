package com.example.demo.model;

import java.util.List;

public class OrderResponse {
	int order_id;
	List<OrderItem> menu;
	double total;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public List<OrderItem> getMenu() {
		return menu;
	}
	public void setMenu(List<OrderItem> menu) {
		this.menu = menu;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public OrderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderResponse [order_id=" + order_id + ", menu=" + menu + ", total=" + total + "]";
	}
	

}
