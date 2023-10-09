package com.microservice.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.user.model.Bike;
import com.microservice.user.model.Car;
import com.microservice.user.model.Usuario;
import com.microservice.user.service.UsuarioService;

@RestController
@RequestMapping("/user")
public class UsuarioController {

	@Autowired
	UsuarioService service;

	@GetMapping
	public ResponseEntity<List<Usuario>> getAll() {
		List<Usuario> users = service.getAll();
		if (users.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(users);
	}

	@PostMapping("/save")
	public Usuario save(@RequestBody Usuario user) {
		return service.save(user);
	}

	@GetMapping("/findById/{id}")
	public Usuario findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}
	
	@GetMapping("/findBikesByUserId/{id}")
	public List<Bike> findBikesByUserId(@PathVariable("id") Integer userId) {
		List<Bike> bikes = service.findBikesByUserId(userId);
		if (bikes.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		return bikes;
	}
	
	@GetMapping("/findCarsByUserId/{id}")
	public List<Car> findCarsByUserId(@PathVariable("id") Integer userId) {
		List<Car> cars = service.findCarsByUserId(userId);
		if (cars.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		return cars;
	}

}
