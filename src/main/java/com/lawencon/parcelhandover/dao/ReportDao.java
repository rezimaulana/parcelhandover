package com.lawencon.parcelhandover.dao;

import java.math.BigDecimal;
import java.util.List;

import com.lawencon.parcelhandover.model.Handover;

public interface ReportDao {
    
    public BigDecimal sumParcel(String startDate, String endDate, String handoverTypeCode);

    public List<Handover> dataInOut(String startDate, String endDate);

    public BigDecimal sumParcelWh(String startDate, String endDate, String handoverTypeCode, String warehouseCode);

    public List<Handover> dataInOutWh(String startDate, String endDate, String warehouseCode);

    public BigDecimal sumParcelDriver(String startDate, String endDate, String handoverTypeCode, String userCode);

    public List<Handover> dataInOutDriver(String startDate, String endDate, String userCode);

    public Double avgSorting(String startDate, String endDate, String handoverTypeCode);

    public Double avgSortingWh(String startDate, String endDate, String handoverTypeCode, String warehouseCode);

    public Double avgSortingDriver(String startDate, String endDate, String handoverTypeCode, String userCode);

}
