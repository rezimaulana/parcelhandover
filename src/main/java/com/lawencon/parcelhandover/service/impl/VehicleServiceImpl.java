package com.lawencon.parcelhandover.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawencon.parcelhandover.constant.ResponseConst;
import com.lawencon.parcelhandover.constant.RoleConst;
import com.lawencon.parcelhandover.dao.VehicleDao;
import com.lawencon.parcelhandover.dto.response.DataListResDto;
import com.lawencon.parcelhandover.dto.response.DataResDto;
import com.lawencon.parcelhandover.dto.response.InsertResDto;
import com.lawencon.parcelhandover.dto.response.TransactionResDto;
import com.lawencon.parcelhandover.dto.response.UpdateResDto;
import com.lawencon.parcelhandover.dto.vehicle.VehicleDataDto;
import com.lawencon.parcelhandover.dto.vehicle.VehicleInsertReqDto;
import com.lawencon.parcelhandover.dto.vehicle.VehicleUpdateReqDto;
import com.lawencon.parcelhandover.model.Vehicle;
import com.lawencon.parcelhandover.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleDao vehicleDao;

	@Transactional(rollbackOn = Exception.class)
	@Override
	public TransactionResDto<InsertResDto> insert(final VehicleInsertReqDto data) {
		final TransactionResDto<InsertResDto> responseBe = new TransactionResDto<InsertResDto>();
		try {
			final Vehicle vehicle = new Vehicle();
			vehicle.setVehiclePlate(data.getVehiclePlate());
			vehicle.setVehicleModel(data.getVehicleModel());
			vehicle.setYearMaking(data.getYearMaking());
			vehicle.setManufacture(data.getManufacture());
			vehicle.setCreatedBy(RoleConst.PRINCIPAL.getName());
			final Vehicle insertOne = vehicleDao.insert(vehicle);
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
	public TransactionResDto<UpdateResDto> update(VehicleUpdateReqDto data) {
		final TransactionResDto<UpdateResDto> responseBe = new TransactionResDto<UpdateResDto>();
		final Optional<Vehicle> optional = vehicleDao.getById(data.getId());
		Vehicle updateOne = null;
		if (optional.isPresent()) {
			updateOne = optional.get();
			try {
				updateOne.setVehicleModel(data.getVehicleModel());
				updateOne.setYearMaking(data.getYearMaking());
				updateOne.setManufacture(data.getManufacture());
				updateOne.setUpdatedBy(RoleConst.PRINCIPAL.getName());
				updateOne.setIsActive(data.getIsActive());
				updateOne.setVer(data.getVer());
				updateOne = vehicleDao.update(updateOne);
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
	public DataResDto<VehicleDataDto> getById(final String id) {
		final Optional<Vehicle> optional = vehicleDao.getById(id);
		Vehicle findOne = null;
		if (optional.isPresent()) {
			findOne = optional.get();
			final VehicleDataDto responseDb = setToDto(findOne);
			final DataResDto<VehicleDataDto> responseBe = new DataResDto<VehicleDataDto>();
			responseBe.setData(responseDb);
			return responseBe;
		} else {
			throw new RuntimeException("Not found!");
		}
	}

	@Override
	public DataListResDto<VehicleDataDto> getAll(final Integer page, final Integer limit) {
		final List<VehicleDataDto> responseDb = new ArrayList<>();
		final List<Vehicle> find = vehicleDao.getAll(page, limit);
		for (int i = 0; i < find.size(); i++) {
			final Vehicle vehicle = find.get(i);
			final VehicleDataDto result = setToDto(vehicle);
			responseDb.add(result);
		}
		final DataListResDto<VehicleDataDto> responseBe = new DataListResDto<VehicleDataDto>();
		responseBe.setData(responseDb);
		return responseBe;
	}

	@Override
	public VehicleDataDto setToDto(Vehicle data) {
		final VehicleDataDto dto = new VehicleDataDto();
		dto.setId(data.getId());
		dto.setVehiclePlate(data.getVehiclePlate());
		dto.setVehicleModel(data.getVehicleModel());
		dto.setYearMaking(data.getYearMaking());
		dto.setManufacture(data.getManufacture());
		dto.setVer(data.getVer());
		dto.setIsActive(data.getIsActive());
		return dto;
	}

}
