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
import com.lawencon.parcelhandover.dao.impl.BaseDaoImpl;
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

@Service
public class HandoverServiceImpl extends BaseDaoImpl implements HandoverService {

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
			final HandoverDataDto responseDb = new HandoverDataDto();
			responseDb.setId(findOne.getId());
            responseDb.setArrivalTime(findOne.getArrivalTime());
            responseDb.setDepartureTime(findOne.getDepartureTime());
            responseDb.setParcelQuantity(findOne.getParcelQuantity());
            responseDb.setWarehouseId(findOne.getWarehouse().getId());
            responseDb.setWarehouseCode(findOne.getWarehouse().getCode());
            responseDb.setWarehouseName(findOne.getWarehouse().getName());
            responseDb.setWarehouseRegion(findOne.getWarehouse().getRegion());
            responseDb.setUserVehicleId(findOne.getUserVehicle().getId());
            responseDb.setUserId(findOne.getUserVehicle().getUser().getId());
            responseDb.setUserCode(findOne.getUserVehicle().getUser().getCode());
            responseDb.setUserFullname(findOne.getUserVehicle().getUser().getFullname());
            responseDb.setVehicleId(findOne.getUserVehicle().getVehicle().getId());
            responseDb.setVehiclePlate(findOne.getUserVehicle().getVehicle().getVehiclePlate());
            responseDb.setHandoverTypeId(findOne.getHandoverType().getId());
            responseDb.setHandoverCode(findOne.getHandoverType().getCode());
            responseDb.setHandoverName(findOne.getHandoverType().getName());
			responseDb.setVer(findOne.getVer());
			responseDb.setIsActive(findOne.getIsActive());
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
			final HandoverDataDto result = new HandoverDataDto();
			result.setId(handover.getId());
            result.setArrivalTime(handover.getArrivalTime());
            result.setDepartureTime(handover.getDepartureTime());
            result.setParcelQuantity(handover.getParcelQuantity());
            result.setWarehouseId(handover.getWarehouse().getId());
            result.setWarehouseCode(handover.getWarehouse().getCode());
            result.setWarehouseName(handover.getWarehouse().getName());
            result.setWarehouseRegion(handover.getWarehouse().getRegion());
            result.setUserVehicleId(handover.getUserVehicle().getId());
            result.setUserId(handover.getUserVehicle().getUser().getId());
            result.setUserCode(handover.getUserVehicle().getUser().getCode());
            result.setUserFullname(handover.getUserVehicle().getUser().getFullname());
            result.setVehicleId(handover.getUserVehicle().getVehicle().getId());
            result.setVehiclePlate(handover.getUserVehicle().getVehicle().getVehiclePlate());
            result.setHandoverTypeId(handover.getHandoverType().getId());
            result.setHandoverCode(handover.getHandoverType().getCode());
            result.setHandoverName(handover.getHandoverType().getName());   
			result.setVer(handover.getVer());
			result.setIsActive(handover.getIsActive());
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
