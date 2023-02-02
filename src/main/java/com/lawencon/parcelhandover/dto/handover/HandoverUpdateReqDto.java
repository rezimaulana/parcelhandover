package com.lawencon.parcelhandover.dto.handover;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class HandoverUpdateReqDto {
    
    @NotNull
    private String id;
    @NotNull
    private String arrivalTime;
    @NotNull
    private String departureTime;
    @NotNull
    private BigDecimal parcelQuantity;
    @NotNull
    private String warehouseCode;
    @NotNull
    private String handoverTypeCode;
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
    public String getHandoverTypeCode() {
        return handoverTypeCode;
    }
    public void setHandoverTypeCode(String handoverTypeCode) {
        this.handoverTypeCode = handoverTypeCode;
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
