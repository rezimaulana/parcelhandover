package com.lawencon.parcelhandover.dao;

import java.util.List;
import java.util.Optional;

import com.lawencon.parcelhandover.model.Warehouse;

public interface WarehouseDao {
    
    public Warehouse insert(Warehouse data);

	public Warehouse update(Warehouse data);

	public Optional<Warehouse> getById(String id);

	public List<Warehouse> getAll(Integer page, Integer limit);

	public Optional<Warehouse> getByCode(String code);

}
