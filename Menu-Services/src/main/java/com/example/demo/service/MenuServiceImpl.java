package com.example.demo.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Menu;
import com.example.demo.exception.MenuNotFoundException;
import com.example.demo.repo.MenuRepository;

import jakarta.annotation.PostConstruct;
@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
MenuRepository menuRepository;
	@PostConstruct
	public void initilizeMenuTable()
	{
		menuRepository.saveAll(Stream.of(
								new Menu("Burger",20),
								new Menu("Samosha",10),
								new Menu("Kachori",20),
								new Menu("PaniPuri",20)
								).collect(Collectors.toList()));
	}
	@Override
	public List<Menu> getMenu() {
		// TODO Auto-generated method stub
		return menuRepository.findAll();
	}

	@Override
	public Menu getMenu(int id) {
		// TODO Auto-generated method stub
		Menu menu=menuRepository.findById(id).orElse(null);
		if(menu==null)
			throw new MenuNotFoundException("Menu id "+id+" does not exist");
		return menu;
	}

	@Override
	public List<Menu> saveMenu(List<Menu> menu) {
		// TODO Auto-generated method stub
		return menuRepository.saveAll(menu);
	}

	@Override
	public String removeMenu(int id) {
		// TODO Auto-generated method stub
		Menu m=menuRepository.findById(id).orElse(null);
		if(m==null)
			throw new MenuNotFoundException("Menu id"+id+" does not exist");
		
			menuRepository.deleteById(m.getId());
			return "Menu id"+m.getId()+" is removed";
		
		
	}

	@Override
	public Menu updateMenu(Menu menu) {
		// TODO Auto-generated method stub
		Menu m=menuRepository.findById(menu.getId()).orElse(null);
		if(m==null)
			throw new MenuNotFoundException("Menu id"+menu.getId()+" does not exist");
		
		return menuRepository.save(menu);
	}

}
