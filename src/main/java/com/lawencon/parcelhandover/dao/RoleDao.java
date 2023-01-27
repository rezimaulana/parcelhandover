package com.lawencon.parcelhandover.dao;

import java.util.List;
import java.util.Optional;

import com.lawencon.parcelhandover.model.Role;

public interface RoleDao {

    public Role insert(Role data);

    public Role update(Role data);

    public Optional<Role> getById(String id);

    public List<Role> getAll(Integer page, Integer limit);
    
}
