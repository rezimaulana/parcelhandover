package com.lawencon.parcelhandover.dto.uservehicle;

public class UserVehicleInsertReqDto {
    
    private String userId;
    private String vehicleId;
    
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    
}
