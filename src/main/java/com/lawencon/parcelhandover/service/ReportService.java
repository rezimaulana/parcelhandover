package com.lawencon.parcelhandover.service;

import org.springframework.stereotype.Service;

import com.lawencon.parcelhandover.dto.handover.HandoverDataDto;
import com.lawencon.parcelhandover.dto.response.ReportResDto;

@Service
public interface ReportService {
    
    public ReportResDto<HandoverDataDto> summaryInOut(String startDate, String endDate);

    // public ReportResDto<HandoverDataDto> summaryInOutWh(String startDate, String endDate, String warehouseCode);
    
    // public ReportResDto<HandoverDataDto> summaryInOutDriver(String startDate, String endDate, String userCode);

    // public ReportResDto<HandoverDataDto> summaryAvgIn(String startDate, String endDate);

    // public ReportResDto<HandoverDataDto> summaryAvgInWh(String startDate, String endDate, String warehouseCode);

    // public ReportResDto<HandoverDataDto> summaryAvgInDriver(String startDate, String endDate, String userCode);

    // public ReportResDto<HandoverDataDto> summaryAvgOut(String startDate, String endDate);

    // public ReportResDto<HandoverDataDto> summaryAvgOutWh(String startDate, String endDate, String warehouseCode);

    // public ReportResDto<HandoverDataDto> summaryAvgOutDriver(String startDate, String endDate, String userCode);

}
