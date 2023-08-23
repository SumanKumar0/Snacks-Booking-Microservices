package com.example.demo.entity;

import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int orderId;
	//menuId:menuQuantity
	String menuList;
	double totalPrice;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int id) {
		this.orderId = id;
	}
	public String getMenuList() {
		return menuList;
	}
	public void setMenuList(String menuList) {
		this.menuList = menuList;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [id=" + orderId + ", menu=" + menuList + ", totalPrice=" + totalPrice + "]";
	}

}
