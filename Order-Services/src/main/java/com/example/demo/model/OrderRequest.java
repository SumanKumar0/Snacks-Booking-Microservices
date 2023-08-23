package com.example.demo.model;

public class OrderRequest {
 int menuId;
 int menuQuantity;
public int getMenuId() {
	return menuId;
}
public void setMenuId(int menuId) {
	this.menuId = menuId;
}
public int getMenuQuantity() {
	return menuQuantity;
}
public void setMenuQuantity(int menuQuantity) {
	this.menuQuantity = menuQuantity;
}
@Override
public String toString() {
	return "OrderRequest [menuId=" + menuId + ", menuQuantity=" + menuQuantity + "]";
}
public OrderRequest() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
