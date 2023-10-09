package com.microservice.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.user.feign.BikeFeignClient;
import com.microservice.user.feign.CarFeignClient;
import com.microservice.user.model.Bike;
import com.microservice.user.model.Car;
import com.microservice.user.model.Usuario;
import com.microservice.user.repo.UsuarioRepo;
import com.microservice.user.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepo repo;
	
	@Autowired
	BikeFeignClient bikeFeign;
	
	@Autowired
	CarFeignClient carFeign;

	public List<Usuario> getAll() {
		return repo.findAll();
	}

	public Usuario save(Usuario user) {
		return repo.save(user);
	}

	public Usuario findById(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Bike> getAllBikes() {
		// TODO Auto-generated method stub
		return bikeFeign.getAll();
	}

	@Override
	public List<Bike> findBikesByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return bikeFeign.findByUserId(userId);
	}
	
	@Override
	public List<Car> findCarsByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return carFeign.findByUserId(userId);
	}

}
