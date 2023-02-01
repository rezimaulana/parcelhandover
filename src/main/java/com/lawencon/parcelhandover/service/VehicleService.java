package com.lawencon.parcelhandover.service;

import com.lawencon.parcelhandover.dto.response.DataListResDto;
import com.lawencon.parcelhandover.dto.response.DataResDto;
import com.lawencon.parcelhandover.dto.response.InsertResDto;
import com.lawencon.parcelhandover.dto.response.TransactionResDto;
import com.lawencon.parcelhandover.dto.response.UpdateResDto;
import com.lawencon.parcelhandover.dto.vehicle.VehicleDataDto;
import com.lawencon.parcelhandover.dto.vehicle.VehicleInsertReqDto;
import com.lawencon.parcelhandover.dto.vehicle.VehicleUpdateReqDto;
import com.lawencon.parcelhandover.model.Vehicle;

public interface VehicleService {
	
	public TransactionResDto<InsertResDto> insert(VehicleInsertReqDto data);

	public TransactionResDto<UpdateResDto> update(VehicleUpdateReqDto data);

	public DataResDto<VehicleDataDto> getById(String id);

	public DataListResDto<VehicleDataDto> getAll(Integer page, Integer limit);

	public VehicleDataDto setToDto(Vehicle data);
	
}
