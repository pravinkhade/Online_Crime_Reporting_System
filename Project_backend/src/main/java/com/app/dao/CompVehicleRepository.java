package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.ComplaintVehicle;

public interface CompVehicleRepository extends JpaRepository<ComplaintVehicle, Integer> {

}
