package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Menu;
@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer>{

}
