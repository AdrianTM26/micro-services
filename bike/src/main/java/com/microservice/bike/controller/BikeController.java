package com.microservice.bike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.bike.service.BikeService;
import com.microservice.bike.model.Bike;

@RestController
@RequestMapping("/bike")
public class BikeController {

	@Autowired
	BikeService service;

	@GetMapping
	public ResponseEntity<List<Bike>> getAll() {
		List<Bike> bikes = service.getAll();
		if (bikes.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(bikes);
	}

	@PostMapping("/save")
	public Bike save(@RequestBody Bike bike) {
		return service.save(bike);
	}

	@GetMapping("/findById/{id}")
	public Bike findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping("/findByUserId/{id}")
	public List<Bike> findByUserId(@PathVariable("id") Integer id) {
		List<Bike> bikes = service.findByUserId(id);
		if (bikes.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		return bikes;
	}

}
