package com.lawencon.parcelhandover.dao.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.Query;

import com.lawencon.parcelhandover.dao.HandoverDao;
import com.lawencon.parcelhandover.model.Handover;

public class HandoverDaoImpl extends BaseDaoImpl implements HandoverDao {

    @Override
    public Handover insert(Handover data) {
        this.em.persist(data);
        return data;
    }

    @Override
    public Handover update(Handover data) {
        final Handover result = this.em.merge(data);
        this.em.flush();
        return result;
    }

    @Override
    public Optional<Handover> getById(String id) {
        final Handover findOne = this.em.find(Handover.class, id);
        em.detach(findOne);
        final Optional<Handover> result = Optional.ofNullable(findOne);
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Handover> getAll(Integer page, Integer limit) {
        final String sql = "SELECT * FROM handover doc ";
        final Query query = this.em.createNativeQuery(sql, Handover.class);
        query.setFirstResult((page-1) * limit);
        query.setMaxResults(limit);
        final List<Handover> result = query.getResultList();
        return result;
    }

    @Override
    public boolean deleteById(String id) {
        final String sql = "DELETE FROM handover WHERE :id = id";
        final int result = this.em.createNativeQuery(sql).setParameter("id", id).executeUpdate();
        return result > 0;
    }
    
}
