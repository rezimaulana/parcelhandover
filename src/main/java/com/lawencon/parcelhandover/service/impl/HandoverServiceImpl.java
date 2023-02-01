package com.lawencon.parcelhandover.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawencon.parcelhandover.constant.ResponseConst;
import com.lawencon.parcelhandover.constant.RoleConst;
import com.lawencon.parcelhandover.dao.HandoverDao;
import com.lawencon.parcelhandover.dao.HandoverTypeDao;
import com.lawencon.parcelhandover.dao.UserVehicleDao;
import com.lawencon.parcelhandover.dao.WarehouseDao;
import com.lawencon.parcelhandover.dto.handover.HandoverDataDto;
import com.lawencon.parcelhandover.dto.handover.HandoverInsertReqDto;
import com.lawencon.parcelhandover.dto.handover.HandoverUpdateReqDto;
import com.lawencon.parcelhandover.dto.response.DataListResDto;
import com.lawencon.parcelhandover.dto.response.DataResDto;
import com.lawencon.parcelhandover.dto.response.DeleteResDto;
import com.lawencon.parcelhandover.dto.response.InsertResDto;
import com.lawencon.parcelhandover.dto.response.TransactionResDto;
import com.lawencon.parcelhandover.dto.response.UpdateResDto;
import com.lawencon.parcelhandover.model.Handover;
import com.lawencon.parcelhandover.model.HandoverType;
import com.lawencon.parcelhandover.model.UserVehicle;
import com.lawencon.parcelhandover.model.Warehouse;
import com.lawencon.parcelhandover.service.HandoverService;
import com.lawencon.parcelhandover.service.impl.base.BaseHandoverService;

@Service
public class HandoverServiceImpl extends BaseHandoverService implements HandoverService {

    @Autowired
    private HandoverDao handoverDao;

    @Autowired
    private WarehouseDao warehouseDao;

    @Autowired
    private HandoverTypeDao handoverTypeDao;

    @Autowired
    private UserVehicleDao userVehicleDao;

    @Transactional(rollbackOn = Exception.class)
    @Override
    public TransactionResDto<InsertResDto> insert(HandoverInsertReqDto data) {
        final TransactionResDto<InsertResDto> responseBe = new TransactionResDto<InsertResDto>();
		try {
			final Handover handover = new Handover();
            final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
            handover.setArrivalTime(LocalDateTime.parse(data.getArrivalTime(), formatter));
            handover.setDepartureTime(LocalDateTime.parse(data.getDepartureTime(), formatter));
            handover.setParcelQuantity(data.getParcelQuantity());
            final Optional<Warehouse> warehouse = warehouseDao.getByCode(data.getWarehouseCode());
            handover.setWarehouse(warehouse.get());
            final Optional<HandoverType> handoverType = handoverTypeDao.getByCode(data.getHandoverTypeCode());
            handover.setHandoverType(handoverType.get());
            final Optional<UserVehicle> userVehicle = userVehicleDao.getById(data.getUserVehicleId());
            handover.setUserVehicle(userVehicle.get());
			handover.setCreatedBy(RoleConst.PRINCIPAL.getName());
			final Handover insertOne = handoverDao.insert(handover);
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
    public TransactionResDto<UpdateResDto> update(HandoverUpdateReqDto data) {
        final TransactionResDto<UpdateResDto> responseBe = new TransactionResDto<UpdateResDto>();
		final Optional<Handover> optional = handoverDao.getById(data.getId());
		Handover updateOne = null;
		if (optional.isPresent()) {
			updateOne = optional.get();
			try {
                final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
                updateOne.setArrivalTime(LocalDateTime.parse(data.getArrivalTime(), formatter));
                updateOne.setDepartureTime(LocalDateTime.parse(data.getDepartureTime(), formatter));
                updateOne.setParcelQuantity(data.getParcelQuantity());
                final Optional<Warehouse> warehouse = warehouseDao.getByCode(data.getWarehouseCode());
                updateOne.setWarehouse(warehouse.get());
                final Optional<HandoverType> handoverType = handoverTypeDao.getByCode(data.getHandoverTypeCode());
                updateOne.setHandoverType(handoverType.get());
				updateOne.setUpdatedBy(RoleConst.PRINCIPAL.getName());
				updateOne.setIsActive(data.getIsActive());
				updateOne.setVer(data.getVer());
				updateOne = handoverDao.update(updateOne);
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
    public DataResDto<HandoverDataDto> getById(String id) {
        final Optional<Handover> optional = handoverDao.getById(id);
		Handover findOne = null;
		if (optional.isPresent()) {
			findOne = optional.get();
			final HandoverDataDto responseDb = setToDto(findOne);
			final DataResDto<HandoverDataDto> responseBe = new DataResDto<HandoverDataDto>();
			responseBe.setData(responseDb);
			return responseBe;
		} else {
			throw new RuntimeException("Not found!");
		}
    }

    @Override
    public DataListResDto<HandoverDataDto> getAll(Integer page, Integer limit) {
        final List<HandoverDataDto> responseDb = new ArrayList<>();
		final List<Handover> find = handoverDao.getAll(page, limit);
		for (int i = 0; i < find.size(); i++) {
			final Handover handover = find.get(i);
			final HandoverDataDto result = setToDto(handover);
			responseDb.add(result);
		}
		final DataListResDto<HandoverDataDto> responseBe = new DataListResDto<HandoverDataDto>();
		responseBe.setData(responseDb);
		return responseBe;
    }

    @Transactional(rollbackOn = Exception.class)
    @Override
    public TransactionResDto<DeleteResDto> deleteById(String id) {
        final TransactionResDto<DeleteResDto> responseBe = new TransactionResDto<DeleteResDto>();
		final Optional<Handover> optional = handoverDao.getById(id);
		if (optional.isPresent()) {
			try {
                handoverDao.deleteById(id);
				final DeleteResDto responseDb = new DeleteResDto();
                responseDb.setId(id);
				responseBe.setData(responseDb);
				responseBe.setMessage(ResponseConst.DELETED.getResponse());
			} catch (Exception e) {
				responseBe.setMessage(e.getMessage());
				e.printStackTrace();
			}
		}
		return responseBe;
    }
    
}
