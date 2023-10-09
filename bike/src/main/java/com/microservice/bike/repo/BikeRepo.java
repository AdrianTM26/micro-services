package com.microservice.bike.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.bike.model.Bike;

public interface BikeRepo extends JpaRepository<Bike, Integer> {

	List<Bike> findByUserId(Integer userId);
}
