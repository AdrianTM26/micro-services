package com.microservice.user.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.user.model.Car;

@FeignClient(name = "car-microservice", path = "/car")
public interface CarFeignClient {

	@GetMapping("/findByUserId/{id}")
	List<Car> findByUserId(@PathVariable("id") Integer id);
}
