package com.lawencon.parcelhandover.dao.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lawencon.parcelhandover.dao.UserVehicleDao;
import com.lawencon.parcelhandover.model.UserVehicle;

@Repository
public class UserVehicleDaoImpl extends BaseDaoImpl implements UserVehicleDao {

    @Override
    public UserVehicle insert(UserVehicle data) {
        this.em.persist(data);
		return data;
    }

    @Override
    public UserVehicle update(UserVehicle data) {
        final UserVehicle result = this.em.merge(data);
        this.em.flush();
        return result;
    }

    @Override
    public Optional<UserVehicle> getById(String id) {
        final UserVehicle findOne = this.em.find(UserVehicle.class, id);
        em.detach(findOne);
        final Optional<UserVehicle> result = Optional.ofNullable(findOne);
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<UserVehicle> getAll(Integer page, Integer limit) {
        final String sql = "SELECT * FROM user_vehicle doc ";
		final Query query = this.em.createNativeQuery(sql, UserVehicle.class);
        query.setFirstResult((page - 1) * limit);
        query.setMaxResults(limit);
        final List<UserVehicle> result = query.getResultList();
        return result;
    }
    
}
