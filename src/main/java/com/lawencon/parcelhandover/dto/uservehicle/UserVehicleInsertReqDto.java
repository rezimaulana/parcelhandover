package com.lawencon.parcelhandover.dto.uservehicle;

import javax.validation.constraints.NotNull;

public class UserVehicleInsertReqDto {
    
    @NotNull
    private String userId;
    @NotNull
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
