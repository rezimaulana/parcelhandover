package com.lawencon.parcelhandover.dto.handover;

public class HandoverInsertReqDto {

    private String arrivalTime;
    private String departureTime;
    private Long parcelQuantity;
    private String warehouseCode;
    private String userVehicleId;
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
    public Long getParcelQuantity() {
        return parcelQuantity;
    }
    public void setParcelQuantity(Long parcelQuantity) {
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
