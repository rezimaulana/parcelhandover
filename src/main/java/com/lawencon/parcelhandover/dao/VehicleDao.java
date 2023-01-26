package com.lawencon.parcelhandover.dao;

import java.util.List;

import com.lawencon.parcelhandover.model.Vehicle;

public interface VehicleDao {

	public Vehicle insert(Vehicle data);

	public Vehicle update(Vehicle data);

	public java.util.Optional<Vehicle> getById(String id);

	public List<Vehicle> getAll(Integer page, Integer limit);

}
