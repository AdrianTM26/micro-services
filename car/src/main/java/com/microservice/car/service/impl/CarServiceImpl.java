package com.microservice.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.car.model.Car;
import com.microservice.car.repo.CarRepo;
import com.microservice.car.service.CarService;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	CarRepo repo;

	@Override
	public Car save(Car car) {
		// TODO Auto-generated method stub
		return repo.save(car);
	}

	@Override
	public Car findById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Car> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Car> findByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return repo.findByUserId(userId);
	}

}
