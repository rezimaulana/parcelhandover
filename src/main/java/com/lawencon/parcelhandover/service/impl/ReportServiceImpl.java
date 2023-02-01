package com.lawencon.parcelhandover.service.impl;

import java.math.BigDecimal;
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
        responseBe.setIncoming(incoming);
        responseBe.setOutgoing(outgoing);
		responseBe.setData(responseDb);
		return responseBe;
    }
    
}
