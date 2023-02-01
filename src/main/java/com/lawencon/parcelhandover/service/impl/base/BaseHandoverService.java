package com.lawencon.parcelhandover.service.impl.base;

import com.lawencon.parcelhandover.dto.handover.HandoverDataDto;
import com.lawencon.parcelhandover.model.Handover;

public class BaseHandoverService {
    
    public HandoverDataDto setToDto(Handover data){
        final HandoverDataDto dto = new HandoverDataDto();
        dto.setId(data.getId());
        dto.setArrivalTime(data.getArrivalTime());
        dto.setDepartureTime(data.getDepartureTime());
        dto.setParcelQuantity(data.getParcelQuantity());
        dto.setWarehouseId(data.getWarehouse().getId());
        dto.setWarehouseCode(data.getWarehouse().getCode());
        dto.setWarehouseName(data.getWarehouse().getName());
        dto.setWarehouseRegion(data.getWarehouse().getRegion());
        dto.setUserVehicleId(data.getUserVehicle().getId());
        dto.setUserId(data.getUserVehicle().getUser().getId());
        dto.setUserCode(data.getUserVehicle().getUser().getCode());
        dto.setUserFullname(data.getUserVehicle().getUser().getFullname());
        dto.setVehicleId(data.getUserVehicle().getVehicle().getId());
        dto.setVehiclePlate(data.getUserVehicle().getVehicle().getVehiclePlate());
        dto.setHandoverTypeId(data.getHandoverType().getId());
        dto.setHandoverCode(data.getHandoverType().getCode());
        dto.setHandoverName(data.getHandoverType().getName());   
        dto.setVer(data.getVer());
        dto.setIsActive(data.getIsActive());
        return dto;
    }

}
