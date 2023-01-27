package com.lawencon.parcelhandover.dao;

import java.util.List;
import java.util.Optional;

import com.lawencon.parcelhandover.model.UserVehicle;

public interface UserVehicleDao {
    
    public UserVehicle insert(UserVehicle data);

	public UserVehicle update(UserVehicle data);

	public Optional<UserVehicle> getById(String id);

	public List<UserVehicle> getAll(Integer page, Integer limit);

}
