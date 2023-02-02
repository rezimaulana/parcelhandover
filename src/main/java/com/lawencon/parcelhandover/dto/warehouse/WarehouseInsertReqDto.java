package com.lawencon.parcelhandover.dto.warehouse;

import javax.validation.constraints.NotNull;

public class WarehouseInsertReqDto {
    
    @NotNull
    private String code;
    @NotNull
    private String name;
    @NotNull
    private String region;
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
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

}
