package com.microservice.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.car.model.Car;
import com.microservice.car.service.CarService;

@RestController
@RequestMapping("car")
public class CarController {

	@Autowired
	CarService service;

	@GetMapping
	public ResponseEntity<List<Car>> getAll() {
		List<Car> cars = service.getAll();
		if (cars.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(cars);
	}

	@PostMapping("/save")
	public Car save(@RequestBody Car car) {
		return service.save(car);
	}

	@GetMapping("/findById/{id}")
	public Car findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping("/findByUserId/{id}")
	public List<Car> findByUserId(@PathVariable("id") Integer id) {
		List<Car> cars = service.findByUserId(id);
		if (cars.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		return cars;
	}

}
