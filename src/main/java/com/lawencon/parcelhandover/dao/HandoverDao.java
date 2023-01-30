package com.lawencon.parcelhandover.dao;

import java.util.List;
import java.util.Optional;

import com.lawencon.parcelhandover.model.Handover;

public interface HandoverDao {
    
    public Handover insert(Handover data);

    public Handover update(Handover data);

    public Optional<Handover> getById(String id);

    public List<Handover> getAll(Integer page, Integer limit);

    public boolean deleteById(final String id);

}
