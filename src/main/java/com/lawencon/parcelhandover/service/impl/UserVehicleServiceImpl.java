package com.lawencon.parcelhandover.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawencon.parcelhandover.constant.ResponseConst;
import com.lawencon.parcelhandover.constant.RoleConst;
import com.lawencon.parcelhandover.dao.UserDao;
import com.lawencon.parcelhandover.dao.UserVehicleDao;
import com.lawencon.parcelhandover.dao.VehicleDao;
import com.lawencon.parcelhandover.dao.impl.BaseDaoImpl;
import com.lawencon.parcelhandover.dto.response.DataListResDto;
import com.lawencon.parcelhandover.dto.response.DataResDto;
import com.lawencon.parcelhandover.dto.response.InsertResDto;
import com.lawencon.parcelhandover.dto.response.TransactionResDto;
import com.lawencon.parcelhandover.dto.response.UpdateResDto;
import com.lawencon.parcelhandover.dto.uservehicle.UserVehicleDataDto;
import com.lawencon.parcelhandover.dto.uservehicle.UserVehicleInsertReqDto;
import com.lawencon.parcelhandover.dto.uservehicle.UserVehicleUpdateReqDto;
import com.lawencon.parcelhandover.model.User;
import com.lawencon.parcelhandover.model.UserVehicle;
import com.lawencon.parcelhandover.model.Vehicle;
import com.lawencon.parcelhandover.service.UserVehicleService;

@Service
public class UserVehicleServiceImpl extends BaseDaoImpl implements UserVehicleService {

    @Autowired
    private UserVehicleDao userVehicleDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private VehicleDao vehicleDao;

    @Transactional(rollbackOn = Exception.class)
    @Override
    public TransactionResDto<InsertResDto> insert(DataListResDto<UserVehicleInsertReqDto> data) {
        final TransactionResDto<InsertResDto> responseBe = new TransactionResDto<InsertResDto>();
        final ArrayList<String> listId = new ArrayList<>();
		try {
			for(int i = 0; i<data.getData().size(); i++){
                final UserVehicle userVehicle = new UserVehicle();
                final Optional<User> user = userDao.getById(data.getData().get(i).getUserId());
                userVehicle.setUser(user.get());
                final Optional<Vehicle> vehicle = vehicleDao.getById(data.getData().get(i).getVehicleId());
                userVehicle.setVehicle(vehicle.get());
                userVehicle.setCreatedBy(RoleConst.PRINCIPAL.getName());
                final UserVehicle insertOne = userVehicleDao.insert(userVehicle);
                listId.add(insertOne.getId());
            }
            final InsertResDto responseDb = new InsertResDto();
			responseDb.setId(listId.toString());
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
    public TransactionResDto<UpdateResDto> update(UserVehicleUpdateReqDto data) {
        final TransactionResDto<UpdateResDto> responseBe = new TransactionResDto<UpdateResDto>();
		final Optional<UserVehicle> optional = userVehicleDao.getById(data.getId());
		UserVehicle updateOne = null;
		if (optional.isPresent()) {
			updateOne = optional.get();
			try {
                final Optional<User> user = userDao.getById(data.getUserId());
                updateOne.setUser(user.get());
                final Optional<Vehicle> vehicle = vehicleDao.getById(data.getVehicleId());
                updateOne.setVehicle(vehicle.get());
				updateOne.setUpdatedBy(RoleConst.PRINCIPAL.getName());
				updateOne.setIsActive(data.getIsActive());
				updateOne.setVer(data.getVer());
				updateOne = userVehicleDao.update(updateOne);
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
    public DataResDto<UserVehicleDataDto> getById(String id) {
        final Optional<UserVehicle> optional = userVehicleDao.getById(id);
		UserVehicle findOne = null;
		if (optional.isPresent()) {
			findOne = optional.get();
			final UserVehicleDataDto responseDb = new UserVehicleDataDto();
			responseDb.setId(findOne.getId());
            responseDb.setUserId(findOne.getUser().getId());
            responseDb.setCode(findOne.getUser().getCode());
            responseDb.setFullname(findOne.getUser().getFullname());
            responseDb.setVehicleId(findOne.getVehicle().getId());
            responseDb.setVehiclePlate(findOne.getVehicle().getVehiclePlate());
            responseDb.setVehicleModel(findOne.getVehicle().getVehicleModel());
            responseDb.setYearMaking(findOne.getVehicle().getYearMaking());
            responseDb.setManufacture(findOne.getVehicle().getManufacture());
			responseDb.setVer(findOne.getVer());
			responseDb.setIsActive(findOne.getIsActive());
			final DataResDto<UserVehicleDataDto> responseBe = new DataResDto<UserVehicleDataDto>();
			responseBe.setData(responseDb);
			return responseBe;
		} else {
			throw new RuntimeException("Not found!");
		}
    }

    @Override
    public DataListResDto<UserVehicleDataDto> getAll(Integer page, Integer limit) {
        final List<UserVehicleDataDto> responseDb = new ArrayList<>();
		final List<UserVehicle> find = userVehicleDao.getAll(page, limit);
		for (int i = 0; i < find.size(); i++) {
			final UserVehicle userVehicle = find.get(i);
			final UserVehicleDataDto result = new UserVehicleDataDto();
			result.setId(userVehicle.getId());
            result.setUserId(userVehicle.getUser().getId());
            result.setCode(userVehicle.getUser().getCode());
            result.setFullname(userVehicle.getUser().getFullname());
            result.setVehicleId(userVehicle.getVehicle().getId());
            result.setVehiclePlate(userVehicle.getVehicle().getVehiclePlate());
            result.setVehicleModel(userVehicle.getVehicle().getVehicleModel());
            result.setYearMaking(userVehicle.getVehicle().getYearMaking());
            result.setManufacture(userVehicle.getVehicle().getManufacture());
			result.setVer(userVehicle.getVer());
			result.setIsActive(userVehicle.getIsActive());
			responseDb.add(result);
		}
		final DataListResDto<UserVehicleDataDto> responseBe = new DataListResDto<UserVehicleDataDto>();
		responseBe.setData(responseDb);
		return responseBe;
    }

}
