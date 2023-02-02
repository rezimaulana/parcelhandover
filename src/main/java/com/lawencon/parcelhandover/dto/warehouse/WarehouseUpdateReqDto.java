package com.lawencon.parcelhandover.dto.warehouse;

import javax.validation.constraints.NotNull;

public class WarehouseUpdateReqDto {
    
    @NotNull
    private String id;
    @NotNull
    private String name;
    @NotNull
    private String region;
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
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
