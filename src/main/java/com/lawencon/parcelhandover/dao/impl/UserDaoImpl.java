package com.lawencon.parcelhandover.dao.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lawencon.parcelhandover.dao.UserDao;
import com.lawencon.parcelhandover.model.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl implements UserDao{

    @Override
    public User insert(User data) {
        this.em.persist(data);
        return data;
    }

    @Override
    public User update(User data) {
        final User result = this.em.merge(data);
        return result;
    }

    @Override
    public Optional<User> getById(String id) {
        final User findOne = this.em.find(User.class, id);
        em.detach(findOne);
        final Optional<User> result = Optional.ofNullable(findOne);
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getAll(Integer page, Integer limit) {
        final String sql = "SELECT * FROM users doc ";
        final Query query = this.em.createNativeQuery(sql, User.class);
        query.setFirstResult((page-1) * limit);
        query.setMaxResults(limit);
        final List<User> result = query.getResultList();
        return result;
    }
    
}
