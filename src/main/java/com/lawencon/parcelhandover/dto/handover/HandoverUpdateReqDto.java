package com.lawencon.parcelhandover.dto.handover;

public class HandoverUpdateReqDto {
    
    private String id;
    private String arrivalTime;
    private String departureTime;
    private Long parcelQuantity;
    private String warehouseCode;
    private String handoverTypeCode;
    private Boolean isActive;
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
