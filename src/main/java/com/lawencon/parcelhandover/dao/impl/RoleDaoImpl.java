package com.lawencon.parcelhandover.dao.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lawencon.parcelhandover.dao.RoleDao;
import com.lawencon.parcelhandover.model.Role;

@Repository
public class RoleDaoImpl extends BaseDaoImpl implements RoleDao{

    @Override
    public Role insert(Role data) {
        this.em.persist(data);
        return data;
    }

    @Override
    public Role update(Role data) {
        final Role result = this.em.merge(data);
        return result;
    }

    @Override
    public Optional<Role> getById(String id) {
        final Role findOne = this.em.find(Role.class, id);
        em.detach(findOne);
        final Optional<Role> result = Optional.ofNullable(findOne);
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Role> getAll(Integer page, Integer limit) {
        final String sql = "SELECT * FROM users doc ";
        final Query query = this.em.createNativeQuery(sql, Role.class);
        query.setFirstResult((page-1) * limit);
        query.setMaxResults(limit);
        final List<Role> result = query.getResultList();
        return result;
    }
    
}
