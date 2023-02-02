package com.lawencon.parcelhandover.dto.handover;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class HandoverInsertReqDto {

    @NotNull
    private String arrivalTime;
    @NotNull
    private String departureTime;
    @NotNull
    private BigDecimal parcelQuantity;
    @NotNull
    private String warehouseCode;
    @NotNull
    private String userVehicleId;
    @NotNull
    private String handoverTypeCode;

    public String getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public String getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    public BigDecimal getParcelQuantity() {
        return parcelQuantity;
    }
    public void setParcelQuantity(BigDecimal parcelQuantity) {
        this.parcelQuantity = parcelQuantity;
    }
    public String getWarehouseCode() {
        return warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }
    public String getUserVehicleId() {
        return userVehicleId;
    }
    public void setUserVehicleId(String userVehicleId) {
        this.userVehicleId = userVehicleId;
    }
    public String getHandoverTypeCode() {
        return handoverTypeCode;
    }
    public void setHandoverTypeCode(String handoverTypeCode) {
        this.handoverTypeCode = handoverTypeCode;
    }
    
}
