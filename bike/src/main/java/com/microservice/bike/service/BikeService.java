package com.microservice.bike.service;

import java.util.List;

import com.microservice.bike.model.Bike;

public interface BikeService {

	Bike save(Bike bike);

	Bike findById(Integer id);

	List<Bike> getAll();

	List<Bike> findByUserId(Integer userId);

}
