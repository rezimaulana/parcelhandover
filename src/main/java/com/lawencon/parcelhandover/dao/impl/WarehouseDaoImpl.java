package com.lawencon.parcelhandover.dao.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lawencon.parcelhandover.dao.WarehouseDao;
import com.lawencon.parcelhandover.model.Warehouse;

@Repository
public class WarehouseDaoImpl extends BaseDaoImpl implements WarehouseDao{

    @Override
    public Warehouse insert(Warehouse data) {
        this.em.persist(data);
		return data;
    }

    @Override
    public Warehouse update(Warehouse data) {
        final Warehouse result = this.em.merge(data);
        this.em.flush();
        return result;
    }

    @Override
    public Optional<Warehouse> getById(String id) {
        final Warehouse findOne = this.em.find(Warehouse.class, id);
        em.detach(findOne);
        final Optional<Warehouse> result = Optional.ofNullable(findOne);
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Warehouse> getAll(Integer page, Integer limit) {
        final String sql = "SELECT * FROM warehouses doc ";
		final Query query = this.em.createNativeQuery(sql, Warehouse.class);
        query.setFirstResult((page - 1) * limit);
        query.setMaxResults(limit);
        final List<Warehouse> result = query.getResultList();
        return result;
    }

    @Override
    public Optional<Warehouse> getByCode(String code) {
        String sql = "SELECT * FROM warehouses WHERE code = :code";
        Query query = em.createNativeQuery(sql, Warehouse.class);
        query.setParameter("code", code);
        Warehouse result = (Warehouse) query.getSingleResult();
        return Optional.ofNullable(result);
    }
    
}
