package com.lawencon.parcelhandover.dto.uservehicle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserVehicleUpdateReqDto {
    
    @NotBlank
    private String id;
    @NotBlank
    private String userId;
    @NotBlank
    private String vehicleId;
    @NotNull
    private Boolean isActive;
    @NotNull
    private Integer ver;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
