package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Menu;

public interface MenuService {
	public List<Menu> getMenu();
	public Menu getMenu(int id);
	public List<Menu> saveMenu(List<Menu> menu);
	public String removeMenu(int id);
	public Menu updateMenu(Menu menu);

}
