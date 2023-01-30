package com.lawencon.parcelhandover.dto.handover;

import java.time.LocalDateTime;

public class HandoverDataDto {

    private String id;
    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;
    private Long parcelQuantity;

    private String warehouseId;
    private String warehouseCode;
    private String warehouseName;
    private String warehouseRegion;

    private String userVehicleId;
    private String userId;
    private String userCode;
    private String userFullname;
    private String vehicleId;
    private String vehiclePlate;

    private String handoverTypeId;
    private String handoverCode;
    private String handoverName;

    private Boolean isActive;
    private Integer ver;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public LocalDateTime getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }
    public Long getParcelQuantity() {
        return parcelQuantity;
    }
    public void setParcelQuantity(Long parcelQuantity) {
        this.parcelQuantity = parcelQuantity;
    }
    public String getWarehouseId() {
        return warehouseId;
    }
    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }
    public String getWarehouseCode() {
        return warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }
    public String getWarehouseName() {
        return warehouseName;
    }
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }
    public String getWarehouseRegion() {
        return warehouseRegion;
    }
    public void setWarehouseRegion(String warehouseRegion) {
        this.warehouseRegion = warehouseRegion;
    }
    public String getUserVehicleId() {
        return userVehicleId;
    }
    public void setUserVehicleId(String userVehicleId) {
        this.userVehicleId = userVehicleId;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserCode() {
        return userCode;
    }
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
    public String getUserFullname() {
        return userFullname;
    }
    public void setUserFullname(String userFullname) {
        this.userFullname = userFullname;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getVehiclePlate() {
        return vehiclePlate;
    }
    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }
    public String getHandoverTypeId() {
        return handoverTypeId;
    }
    public void setHandoverTypeId(String handoverTypeId) {
        this.handoverTypeId = handoverTypeId;
    }
    public String getHandoverCode() {
        return handoverCode;
    }
    public void setHandoverCode(String handoverCode) {
        this.handoverCode = handoverCode;
    }
    public String getHandoverName() {
        return handoverName;
    }
    public void setHandoverName(String handoverName) {
        this.handoverName = handoverName;
    }
    public Boolean getIsActive() {
        return isActive;
    }
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
    public Integer getVer() {
        return ver;
    }
    public void setVer(Integer ver) {
        this.ver = ver;
    }
    
    

}
