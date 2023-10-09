package com.microservice.bike.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.bike.model.Bike;
import com.microservice.bike.repo.BikeRepo;
import com.microservice.bike.service.BikeService;

@Service
public class BikeServiceImpl implements BikeService {

	@Autowired(required = true)
	BikeRepo repo;

	@Override
	public Bike save(Bike bike) {
		// TODO Auto-generated method stub
		return repo.save(bike);
	}

	@Override
	public Bike findById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Bike> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Bike> findByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return repo.findByUserId(userId);
	}

}
