package com.lawencon.parcelhandover.dao;

import java.math.BigDecimal;
import java.util.List;

import com.lawencon.parcelhandover.model.Handover;

public interface ReportDao {
    
    public BigDecimal sumParcel(String startDate, String endDate, String handoverTypeCode);

    public List<Handover> dataInOut(String startDate, String endDate);

}
