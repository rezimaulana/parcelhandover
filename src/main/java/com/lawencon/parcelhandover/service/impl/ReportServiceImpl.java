package com.lawencon.parcelhandover.service.impl;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawencon.parcelhandover.constant.HandoverTypeConst;
import com.lawencon.parcelhandover.dao.ReportDao;
import com.lawencon.parcelhandover.dto.handover.HandoverDataDto;
import com.lawencon.parcelhandover.dto.response.ReportResDto;
import com.lawencon.parcelhandover.model.Handover;
import com.lawencon.parcelhandover.service.ReportService;
import com.lawencon.parcelhandover.service.impl.base.BaseHandoverService;

@Service
public class ReportServiceImpl extends BaseHandoverService implements ReportService {

    @Autowired
    private ReportDao reportDao;

    @Override
    public ReportResDto<HandoverDataDto> summaryInOut(String startDate, String endDate) {
        final List<HandoverDataDto> responseDb = new ArrayList<>();
        startDate = startDate + " 00:00:00";
        endDate = endDate + " 23:59:59";
        final BigDecimal incoming = reportDao.sumParcel(startDate, endDate, HandoverTypeConst.INCOMING.getCode());
        final BigDecimal outgoing = reportDao.sumParcel(startDate, endDate, HandoverTypeConst.OUTGOING.getCode());
		final List<Handover> find = reportDao.dataInOut(startDate, endDate);
		for (int i = 0; i < find.size(); i++) {
			final Handover handover = find.get(i);
			final HandoverDataDto result = setToDto(handover);
			responseDb.add(result);
		}
		final ReportResDto<HandoverDataDto> responseBe = new ReportResDto<HandoverDataDto>();
        if(incoming!=null){
            responseBe.setIncoming(incoming.toString());
        }
        if(outgoing!=null){
            responseBe.setOutgoing(outgoing.toString());
        }
		responseBe.setData(responseDb);
		return responseBe;
    }

    @Override
    public ReportResDto<HandoverDataDto> summaryInOutWh(String startDate, String endDate, String warehouseCode) {
        final List<HandoverDataDto> responseDb = new ArrayList<>();
        startDate = startDate + " 00:00:00";
        endDate = endDate + " 23:59:59";
        final BigDecimal incoming = reportDao.sumParcelWh(startDate, endDate, HandoverTypeConst.INCOMING.getCode(), warehouseCode);
        final BigDecimal outgoing = reportDao.sumParcelWh(startDate, endDate, HandoverTypeConst.OUTGOING.getCode(), warehouseCode);
		final List<Handover> find = reportDao.dataInOutWh(startDate, endDate, warehouseCode);
		for (int i = 0; i < find.size(); i++) {
			final Handover handover = find.get(i);
			final HandoverDataDto result = setToDto(handover);
			responseDb.add(result);
		}
		final ReportResDto<HandoverDataDto> responseBe = new ReportResDto<HandoverDataDto>();
        if(incoming!=null){
            responseBe.setIncoming(incoming.toString());
        }
        if(outgoing!=null){
            responseBe.setOutgoing(outgoing.toString());
        }
		responseBe.setData(responseDb);
		return responseBe;
    }

    @Override
    public ReportResDto<HandoverDataDto> summaryInOutDriver(String startDate, String endDate, String userCode) {
        final List<HandoverDataDto> responseDb = new ArrayList<>();
        startDate = startDate + " 00:00:00";
        endDate = endDate + " 23:59:59";
        final BigDecimal incoming = reportDao.sumParcelDriver(startDate, endDate, HandoverTypeConst.INCOMING.getCode(), userCode);
        final BigDecimal outgoing = reportDao.sumParcelDriver(startDate, endDate, HandoverTypeConst.OUTGOING.getCode(), userCode);
		final List<Handover> find = reportDao.dataInOutDriver(startDate, endDate, userCode);
		for (int i = 0; i < find.size(); i++) {
			final Handover handover = find.get(i);
			final HandoverDataDto result = setToDto(handover);
			responseDb.add(result);
		}
		final ReportResDto<HandoverDataDto> responseBe = new ReportResDto<HandoverDataDto>();
        if(incoming!=null){
            responseBe.setIncoming(incoming.toString());
        }
        if(outgoing!=null){
            responseBe.setOutgoing(outgoing.toString());
        }
		responseBe.setData(responseDb);
		return responseBe;
    }

    @Override
    public ReportResDto<HandoverDataDto> sortingAvgInOut(String startDate, String endDate) {
        final List<HandoverDataDto> responseDb = new ArrayList<>();
        startDate = startDate + " 00:00:00";
        endDate = endDate + " 23:59:59";
        double incoming = reportDao.avgSorting(startDate, endDate, HandoverTypeConst.INCOMING.getCode());
        double outgoing = reportDao.avgSorting(startDate, endDate, HandoverTypeConst.OUTGOING.getCode());
		final List<Handover> find = reportDao.dataInOut(startDate, endDate);
		for (int i = 0; i < find.size(); i++) {
			final Handover handover = find.get(i);
			final HandoverDataDto result = setToDto(handover);
			responseDb.add(result);
		}
		final ReportResDto<HandoverDataDto> responseBe = new ReportResDto<HandoverDataDto>();
        Duration avgIncoming = Duration.ofSeconds((long) incoming);
        responseBe.setIncoming(avgIncoming.toString());
        Duration avgOutgoing = Duration.ofSeconds((long) outgoing);
        responseBe.setOutgoing(avgOutgoing.toString());
		responseBe.setData(responseDb);
		return responseBe;
    }

    @Override
    public ReportResDto<HandoverDataDto> sortingAvgInOutWh(String startDate, String endDate, String warehouseCode) {
        final List<HandoverDataDto> responseDb = new ArrayList<>();
        startDate = startDate + " 00:00:00";
        endDate = endDate + " 23:59:59";
        double incoming = reportDao.avgSortingWh(startDate, endDate, HandoverTypeConst.INCOMING.getCode(), warehouseCode);
        double outgoing = reportDao.avgSortingWh(startDate, endDate, HandoverTypeConst.OUTGOING.getCode(), warehouseCode);
		final List<Handover> find = reportDao.dataInOutWh(startDate, endDate, warehouseCode);
		for (int i = 0; i < find.size(); i++) {
			final Handover handover = find.get(i);
			final HandoverDataDto result = setToDto(handover);
			responseDb.add(result);
		}
		final ReportResDto<HandoverDataDto> responseBe = new ReportResDto<HandoverDataDto>();
        Duration avgIncoming = Duration.ofSeconds((long) incoming);
        responseBe.setIncoming(avgIncoming.toString());
        Duration avgOutgoing = Duration.ofSeconds((long) outgoing);
        responseBe.setOutgoing(avgOutgoing.toString());
		responseBe.setData(responseDb);
		return responseBe;
    }

    @Override
    public ReportResDto<HandoverDataDto> sortingAvgInOutDriver(String startDate, String endDate, String userCode) {
        final List<HandoverDataDto> responseDb = new ArrayList<>();
        startDate = startDate + " 00:00:00";
        endDate = endDate + " 23:59:59";
        double incoming = reportDao.avgSortingDriver(startDate, endDate, HandoverTypeConst.INCOMING.getCode(), userCode);
        double outgoing = reportDao.avgSortingDriver(startDate, endDate, HandoverTypeConst.OUTGOING.getCode(), userCode);
		final List<Handover> find = reportDao.dataInOutDriver(startDate, endDate, userCode);
		for (int i = 0; i < find.size(); i++) {
			final Handover handover = find.get(i);
			final HandoverDataDto result = setToDto(handover);
			responseDb.add(result);
		}
		final ReportResDto<HandoverDataDto> responseBe = new ReportResDto<HandoverDataDto>();
        Duration avgIncoming = Duration.ofSeconds((long) incoming);
        responseBe.setIncoming(avgIncoming.toString());
        Duration avgOutgoing = Duration.ofSeconds((long) outgoing);
        responseBe.setOutgoing(avgOutgoing.toString());
		responseBe.setData(responseDb);
		return responseBe;
    }
    
}
