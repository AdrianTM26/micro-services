package com.microservice.car.service;

import java.util.List;

import com.microservice.car.model.Car;

public interface CarService {

	Car save(Car car);

	Car findById(Integer id);

	List<Car> getAll();

	List<Car> findByUserId(Integer userId);
}
