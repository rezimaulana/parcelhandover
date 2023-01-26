package com.lawencon.parcelhandover.service.impl;

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
public class VehicleServiceImpl implements VehicleService{

	@Autowired
	private VehicleDao vehicleDao;
	
	@Transactional(rollbackOn = Exception.class)
	@Override
	public TransactionResDto<InsertResDto> insert(final VehicleInsertReqDto data) {
		 final TransactionResDto<InsertResDto> responseBe = new TransactionResDto<InsertResDto>();
	        try {
	            final Vehicle vehicle = new Vehicle	();
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

	@Override
	public TransactionResDto<UpdateResDto> update(VehicleUpdateReqDto data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResDto<VehicleDataDto> getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataListResDto<VehicleDataDto> getAll(Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return null;
	}

}
