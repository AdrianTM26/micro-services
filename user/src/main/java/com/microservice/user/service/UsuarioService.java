package com.microservice.user.service;

import java.util.List;

import com.microservice.user.model.Bike;
import com.microservice.user.model.Car;
import com.microservice.user.model.Usuario;

public interface UsuarioService {

	Usuario save(Usuario user);

	Usuario findById(Integer id);

	List<Usuario> getAll();
	
	List<Bike> getAllBikes();

	List<Bike> findBikesByUserId(Integer userId);
	
	List<Car> findCarsByUserId(Integer userId);

}
