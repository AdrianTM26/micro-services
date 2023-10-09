package com.microservice.user.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.user.model.Bike;

// Se omite el url ya que el microservicio está registrado en Eureka
//@FeignClient(name = "bike-microservice", url = "http://localhost:9092", path = "/bike")
@FeignClient(name = "bike-microservice", path = "/bike")
public interface BikeFeignClient {

	@GetMapping
	List<Bike> getAll();

	@GetMapping("/findByUserId/{id}")
	List<Bike> findByUserId(@PathVariable("id") Integer id);
}
