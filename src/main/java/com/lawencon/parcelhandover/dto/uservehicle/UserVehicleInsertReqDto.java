package com.lawencon.parcelhandover.dto.uservehicle;

import javax.validation.constraints.NotBlank;

public class UserVehicleInsertReqDto {
    
    @NotBlank
    private String userId;
    @NotBlank
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
