package com.lawencon.parcelhandover.dao.impl;

import java.util.Optional;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lawencon.parcelhandover.dao.HandoverTypeDao;
import com.lawencon.parcelhandover.model.HandoverType;

@Repository
public class HandoverTypeDaoImpl extends BaseDaoImpl implements HandoverTypeDao {

    @Override
    public Optional<HandoverType> getByCode(String code) {
        String sql = "SELECT * FROM handover_type WHERE code = :code";
        Query query = em.createNativeQuery(sql, HandoverType.class);
        query.setParameter("code", code);
        HandoverType result = (HandoverType) query.getSingleResult();
        return Optional.ofNullable(result);
    }
    
}
