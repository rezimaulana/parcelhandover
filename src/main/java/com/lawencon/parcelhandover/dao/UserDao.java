package com.lawencon.parcelhandover.dao;

import java.util.List;
import java.util.Optional;

import com.lawencon.parcelhandover.model.User;

public interface UserDao {
    
    public User insert(User data);

    public User update(User data);

    public Optional<User> getById(String id);

    public List<User> getAll(Integer page, Integer limit);

}
