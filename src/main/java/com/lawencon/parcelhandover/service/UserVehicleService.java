package com.lawencon.parcelhandover.service;

import com.lawencon.parcelhandover.dto.response.DataListResDto;
import com.lawencon.parcelhandover.dto.response.DataResDto;
import com.lawencon.parcelhandover.dto.response.InsertResDto;
import com.lawencon.parcelhandover.dto.response.TransactionResDto;
import com.lawencon.parcelhandover.dto.response.UpdateResDto;
import com.lawencon.parcelhandover.dto.uservehicle.UserVehicleDataDto;
import com.lawencon.parcelhandover.dto.uservehicle.UserVehicleInsertReqDto;
import com.lawencon.parcelhandover.dto.uservehicle.UserVehicleUpdateReqDto;

public interface UserVehicleService {

    public TransactionResDto<InsertResDto> insert(DataListResDto<UserVehicleInsertReqDto> data);

	public TransactionResDto<UpdateResDto> update(UserVehicleUpdateReqDto data);

	public DataResDto<UserVehicleDataDto> getById(String id);

	public DataListResDto<UserVehicleDataDto> getAll(Integer page, Integer limit);

}
