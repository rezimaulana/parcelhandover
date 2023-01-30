package com.lawencon.parcelhandover.dao;

import java.util.Optional;

import com.lawencon.parcelhandover.model.HandoverType;

public interface HandoverTypeDao {
    
    public Optional<HandoverType> getByCode(String code);

}
