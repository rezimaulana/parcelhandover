package com.lawencon.parcelhandover.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawencon.parcelhandover.constant.ResponseConst;
import com.lawencon.parcelhandover.constant.RoleConst;
import com.lawencon.parcelhandover.dao.WarehouseDao;
import com.lawencon.parcelhandover.dao.impl.BaseDaoImpl;
import com.lawencon.parcelhandover.dto.response.DataListResDto;
import com.lawencon.parcelhandover.dto.response.DataResDto;
import com.lawencon.parcelhandover.dto.response.InsertResDto;
import com.lawencon.parcelhandover.dto.response.TransactionResDto;
import com.lawencon.parcelhandover.dto.response.UpdateResDto;
import com.lawencon.parcelhandover.dto.warehouse.WarehouseDataDto;
import com.lawencon.parcelhandover.dto.warehouse.WarehouseInsertReqDto;
import com.lawencon.parcelhandover.dto.warehouse.WarehouseUpdateReqDto;
import com.lawencon.parcelhandover.model.Warehouse;
import com.lawencon.parcelhandover.service.WarehouseService;

@Service
public class WarehouseServiceImpl extends BaseDaoImpl implements WarehouseService {

    @Autowired
    private WarehouseDao warehouseDao;

    @Transactional(rollbackOn = Exception.class)
    @Override
    public TransactionResDto<InsertResDto> insert(WarehouseInsertReqDto data) {
        final TransactionResDto<InsertResDto> responseBe = new TransactionResDto<InsertResDto>();
		try {
			final Warehouse warehouse = new Warehouse();
            warehouse.setCode(data.getCode());
            warehouse.setName(data.getName());
            warehouse.setRegion(data.getRegion());
			warehouse.setCreatedBy(RoleConst.PRINCIPAL.getName());
			final Warehouse insertOne = warehouseDao.insert(warehouse);
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
    public TransactionResDto<UpdateResDto> update(WarehouseUpdateReqDto data) {
        final TransactionResDto<UpdateResDto> responseBe = new TransactionResDto<UpdateResDto>();
		final Optional<Warehouse> optional = warehouseDao.getById(data.getId());
		Warehouse updateOne = null;
		if (optional.isPresent()) {
			updateOne = optional.get();
			try {
                updateOne.setName(data.getName());
                updateOne.setRegion(data.getRegion());
				updateOne.setUpdatedBy(RoleConst.PRINCIPAL.getName());
				updateOne.setIsActive(data.getIsActive());
				updateOne.setVer(data.getVer());
				updateOne = warehouseDao.update(updateOne);
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
    public DataResDto<WarehouseDataDto> getById(String id) {
        final Optional<Warehouse> optional = warehouseDao.getById(id);
		Warehouse findOne = null;
		if (optional.isPresent()) {
			findOne = optional.get();
			final WarehouseDataDto responseDb = setToDto(findOne);
			final DataResDto<WarehouseDataDto> responseBe = new DataResDto<WarehouseDataDto>();
			responseBe.setData(responseDb);
			return responseBe;
		} else {
			throw new RuntimeException("Not found!");
		}
    }

    @Override
    public DataListResDto<WarehouseDataDto> getAll(Integer page, Integer limit) {
        final List<WarehouseDataDto> responseDb = new ArrayList<>();
		final List<Warehouse> find = warehouseDao.getAll(page, limit);
		for (int i = 0; i < find.size(); i++) {
			final Warehouse warehouse = find.get(i);
			final WarehouseDataDto result = setToDto(warehouse);
			responseDb.add(result);
		}
		final DataListResDto<WarehouseDataDto> responseBe = new DataListResDto<WarehouseDataDto>();
		responseBe.setData(responseDb);
		return responseBe;
    }

	@Override
	public WarehouseDataDto setToDto(Warehouse data) {
		final WarehouseDataDto dto = new WarehouseDataDto();
		dto.setId(data.getId());
		dto.setCode(data.getCode());
		dto.setName(data.getName());
		dto.setRegion(data.getRegion());
		dto.setVer(data.getVer());
		dto.setIsActive(data.getIsActive());
		return dto;
	}
    
}
