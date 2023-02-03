package com.lawencon.parcelhandover.dto.warehouse;

import javax.validation.constraints.NotBlank;

public class WarehouseInsertReqDto {
    
    @NotBlank
    private String code;
    @NotBlank
    private String name;
    @NotBlank
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
