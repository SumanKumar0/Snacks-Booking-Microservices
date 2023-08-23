package com.example.demo.model;

public class OrderItem {
	int menuId;
	String menuName;
	double menuPrice;
	double totalPrice;
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public double getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(double menuPrice) {
		this.menuPrice = menuPrice;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getMenuQuantity() {
		return menuQuantity;
	}
	public void setMenuQuantity(int menuQuantity) {
		this.menuQuantity = menuQuantity;
	}
	int menuQuantity;
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderItem [menuId=" + menuId + ", menuName=" + menuName + ", menuPrice=" + menuPrice + ", totalPrice="
				+ totalPrice + ", menuQuantity=" + menuQuantity + "]";
	}
	
}
