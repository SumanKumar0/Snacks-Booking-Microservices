package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.exception.OrderNotFoundException;
import com.example.demo.model.Menu;
import com.example.demo.model.OrderBooking;
import com.example.demo.model.OrderItem;
import com.example.demo.model.OrderRequest;
import com.example.demo.model.OrderResponse;
import com.example.demo.repo.OrderRepo;

@Service
public  class OrderServiceImpl implements OrderService {
@Autowired	
OrderRepo orderRepo;
@Autowired
MenuService menuService;
	@Override
	public String makeOrder(OrderBooking orderBooking) {
		// TODO Auto-generated method stub
		
		String menuItemList="";
		double total=0;
		for(OrderRequest orderRequest:orderBooking.getOrderRequest())
		{
			
			Menu m=menuService.getMenu(orderRequest.getMenuId());
			total=total+m.getPrice()*orderRequest.getMenuQuantity();
			String s=orderRequest.getMenuId()+":"+orderRequest.getMenuQuantity();
			menuItemList+=s+",";
			
		}
		Order o=new Order();
		o.setMenuList(menuItemList);
		o.setTotalPrice(total);
		o=orderRepo.save(o);
		
		
		
		return "You order has been received Succesful.Your Order id is "+o.getOrderId()+" .";
	}

	
	

	
	@Override
	public OrderResponse createOrderResponse(int id) {
		// TODO Auto-generated method stub
		Order o=orderRepo.findById(id).orElse(null);
		List<OrderItem> OrderItemList=new ArrayList();
		if(o==null)
			throw new OrderNotFoundException("Order id "+id+" Not Found");
		
		String menuIdList=o.getMenuList();
		double total=0;
		for(String s:menuIdList.split(",")) {
			String[] mlist=s.split(":");
			Menu menu=menuService.getMenu(Integer.parseInt(mlist[0]));
			
			int menuQuantity=Integer.parseInt(mlist[1]);
			
			double menuTotalPrice=menuQuantity*menu.getPrice();
			total=total+menuTotalPrice;
			OrderItem orderItem=new OrderItem();
			orderItem.setMenuId(menu.getId());
			orderItem.setMenuName(menu.getName());
			orderItem.setMenuPrice(menu.getPrice());
			orderItem.setMenuQuantity(menuQuantity);
			orderItem.setTotalPrice(menuTotalPrice);
			OrderItemList.add(orderItem);
			
		}
		OrderResponse orderResponse= new OrderResponse();
		orderResponse.setMenu(OrderItemList);
		orderResponse.setOrder_id(o.getOrderId());
		orderResponse.setTotal(total);
		
		return orderResponse;
	}

	@Override
	public List<OrderResponse> createOrderResponse() {
		// TODO Auto-generated method stub
		List<Order> orderList=orderRepo.findAll();
		List<OrderResponse> orderResponseList= new ArrayList();
		for(Order order:orderList) {
		List<OrderItem> OrderItemList=new ArrayList();
		if(order==null)
			throw new OrderNotFoundException("Order id"+order.getOrderId()+" Not Found");
		
		String menuIdList=order.getMenuList();
		double total=0;
		for(String s:menuIdList.split(",")) {
			String[] mlist=s.split(":");
			Menu menu=menuService.getMenu(Integer.parseInt(mlist[0]));
			
			int menuQuantity=Integer.parseInt(mlist[1]);
			
			double menuTotalPrice=menuQuantity*menu.getPrice();
			total=total+menuTotalPrice;
			OrderItem orderItem=new OrderItem();
			orderItem.setMenuId(menu.getId());
			orderItem.setMenuName(menu.getName());
			orderItem.setMenuPrice(menu.getPrice());
			orderItem.setMenuQuantity(menuQuantity);
			orderItem.setTotalPrice(menuTotalPrice);
			OrderItemList.add(orderItem);
			
		}
		OrderResponse orderResponse= new OrderResponse();
		orderResponse.setMenu(OrderItemList);
		orderResponse.setOrder_id(order.getOrderId());
		orderResponse.setTotal(total);
		orderResponseList.add(orderResponse);
		}
		return orderResponseList;

		
	}

	}
