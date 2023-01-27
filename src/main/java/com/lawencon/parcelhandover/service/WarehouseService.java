package com.lawencon.parcelhandover.service;

import com.lawencon.parcelhandover.dto.response.DataListResDto;
import com.lawencon.parcelhandover.dto.response.DataResDto;
import com.lawencon.parcelhandover.dto.response.InsertResDto;
import com.lawencon.parcelhandover.dto.response.TransactionResDto;
import com.lawencon.parcelhandover.dto.response.UpdateResDto;
import com.lawencon.parcelhandover.dto.warehouse.WarehouseDataDto;
import com.lawencon.parcelhandover.dto.warehouse.WarehouseInsertReqDto;
import com.lawencon.parcelhandover.dto.warehouse.WarehouseUpdateReqDto;

public interface WarehouseService {
    
    public TransactionResDto<InsertResDto> insert(WarehouseInsertReqDto data);

	public TransactionResDto<UpdateResDto> update(WarehouseUpdateReqDto data);

	public DataResDto<WarehouseDataDto> getById(String id);

	public DataListResDto<WarehouseDataDto> getAll(Integer page, Integer limit);
    
}
