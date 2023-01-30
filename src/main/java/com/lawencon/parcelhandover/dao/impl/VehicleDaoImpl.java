package com.lawencon.parcelhandover.dao.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lawencon.parcelhandover.dao.VehicleDao;
import com.lawencon.parcelhandover.model.Vehicle;

@Repository
public class VehicleDaoImpl extends BaseDaoImpl implements VehicleDao{

	@Override
	public Vehicle insert(final Vehicle data) {
		this.em.persist(data);
		return data;
	}

	@Override
	public Vehicle update(final Vehicle data) {
		final Vehicle result = this.em.merge(data);
		this.em.flush();
        return result;
	}

	@Override
	public Optional<Vehicle> getById(final String id) {
		final Vehicle findOne = this.em.find(Vehicle.class, id);
        em.detach(findOne);
        final Optional<Vehicle> result = Optional.ofNullable(findOne);
        return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vehicle> getAll(final Integer page, final Integer limit) {
		final String sql = "SELECT * FROM vehicles doc ";
		final Query query = this.em.createNativeQuery(sql, Vehicle.class);
        query.setFirstResult((page - 1) * limit);
        query.setMaxResults(limit);
        final List<Vehicle> result = query.getResultList();
        return result;
	}
	
}
