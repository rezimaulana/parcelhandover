package com.lawencon.parcelhandover.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawencon.parcelhandover.constant.ResponseConst;
import com.lawencon.parcelhandover.constant.RoleConst;
import com.lawencon.parcelhandover.dao.RoleDao;
import com.lawencon.parcelhandover.dao.UserDao;
import com.lawencon.parcelhandover.dao.impl.BaseDaoImpl;
import com.lawencon.parcelhandover.dto.response.DataListResDto;
import com.lawencon.parcelhandover.dto.response.DataResDto;
import com.lawencon.parcelhandover.dto.response.InsertResDto;
import com.lawencon.parcelhandover.dto.response.TransactionResDto;
import com.lawencon.parcelhandover.dto.response.UpdateResDto;
import com.lawencon.parcelhandover.dto.user.UserDataDto;
import com.lawencon.parcelhandover.dto.user.UserInsertReqDto;
import com.lawencon.parcelhandover.dto.user.UserUpdateReqDto;
import com.lawencon.parcelhandover.model.Role;
import com.lawencon.parcelhandover.model.User;
import com.lawencon.parcelhandover.service.UserService;

@Service
public class UserServiceImpl extends BaseDaoImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Transactional(rollbackOn = Exception.class)
    @Override
    public TransactionResDto<InsertResDto> insert(UserInsertReqDto data) {
        final TransactionResDto<InsertResDto> responseBe = new TransactionResDto<InsertResDto>();
		try {
			final User user = new User();
            user.setCode(data.getCode());
            user.setFullname(data.getFullname());
            final Optional<Role> role = roleDao.getById(data.getRole());
            user.setRole(role.get());
			user.setCreatedBy(RoleConst.PRINCIPAL.getName());
			final User insertOne = userDao.insert(user);
			final InsertResDto responseDb = new InsertResDto();
			responseDb.setId(insertOne.getId());
			responseBe.setData(responseDb);
			responseBe.setMessage(ResponseConst.CREATED.getResponse());
		} catch (Exception e) {
			responseBe.setMessage(e.getMessage());
			e.printStackTrace();
		}
		return responseBe;
    }

    @Transactional(rollbackOn = Exception.class)
    @Override
    public TransactionResDto<UpdateResDto> update(UserUpdateReqDto data) {
        final TransactionResDto<UpdateResDto> responseBe = new TransactionResDto<UpdateResDto>();
		final Optional<User> optional = userDao.getById(data.getId());
		User updateOne = null;
		if (optional.isPresent()) {
			updateOne = optional.get();
			try {
				updateOne.setFullname(data.getFullname());
				updateOne.setUpdatedBy(RoleConst.PRINCIPAL.getName());
				updateOne.setIsActive(data.getIsActive());
				updateOne.setVer(data.getVer());
				updateOne = userDao.update(updateOne);
				final UpdateResDto responseDb = new UpdateResDto();
				responseDb.setVer(updateOne.getVer());
				responseBe.setData(responseDb);
				responseBe.setMessage(ResponseConst.UPDATED.getResponse());
			} catch (Exception e) {
				responseBe.setMessage(e.getMessage());
				e.printStackTrace();
			}
		}
		return responseBe;
    }

    @Override
    public DataResDto<UserDataDto> getById(String id) {
        final Optional<User> optional = userDao.getById(id);
		User findOne = null;
		if (optional.isPresent()) {
			findOne = optional.get();
			final UserDataDto responseDb = setToDto(findOne);
			final DataResDto<UserDataDto> responseBe = new DataResDto<UserDataDto>();
			responseBe.setData(responseDb);
			return responseBe;
		} else {
			throw new RuntimeException("Not found!");
		}
    }

    @Override
    public DataListResDto<UserDataDto> getAll(Integer page, Integer limit) {
        final List<UserDataDto> responseDb = new ArrayList<>();
		final List<User> find = userDao.getAll(page, limit);
		for (int i = 0; i < find.size(); i++) {
			final User user = find.get(i);
			final UserDataDto result = setToDto(user);
			responseDb.add(result);
		}
		final DataListResDto<UserDataDto> responseBe = new DataListResDto<UserDataDto>();
		responseBe.setData(responseDb);
		return responseBe;
    }

	@Override
	public UserDataDto setToDto(User data) {
		final UserDataDto dto = new UserDataDto();
		dto.setId(data.getId());
		dto.setCode(data.getCode());
		dto.setFullname(data.getFullname());
		dto.setRoleId(data.getRole().getId());
		dto.setRoleCode(data.getRole().getCode());
		dto.setRoleName(data.getRole().getName());
		dto.setVer(data.getVer());
		dto.setIsActive(data.getIsActive());
		return dto;
	}
    
}
