package com.lawencon.parcelhandover.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawencon.parcelhandover.constant.HandoverTypeConst;
import com.lawencon.parcelhandover.dao.ReportDao;
import com.lawencon.parcelhandover.dao.impl.BaseDaoImpl;
import com.lawencon.parcelhandover.dto.handover.HandoverDataDto;
import com.lawencon.parcelhandover.dto.response.ReportResDto;
import com.lawencon.parcelhandover.model.Handover;
import com.lawencon.parcelhandover.service.ReportService;

@Service
public class ReportServiceImpl extends BaseDaoImpl implements ReportService {

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
			final HandoverDataDto result = new HandoverDataDto();
			result.setId(handover.getId());
            result.setArrivalTime(handover.getArrivalTime());
            result.setDepartureTime(handover.getDepartureTime());
            result.setParcelQuantity(handover.getParcelQuantity());
            result.setWarehouseId(handover.getWarehouse().getId());
            result.setWarehouseCode(handover.getWarehouse().getCode());
            result.setWarehouseName(handover.getWarehouse().getName());
            result.setWarehouseRegion(handover.getWarehouse().getRegion());
            result.setUserVehicleId(handover.getUserVehicle().getId());
            result.setUserId(handover.getUserVehicle().getUser().getId());
            result.setUserCode(handover.getUserVehicle().getUser().getCode());
            result.setUserFullname(handover.getUserVehicle().getUser().getFullname());
            result.setVehicleId(handover.getUserVehicle().getVehicle().getId());
            result.setVehiclePlate(handover.getUserVehicle().getVehicle().getVehiclePlate());
            result.setHandoverTypeId(handover.getHandoverType().getId());
            result.setHandoverCode(handover.getHandoverType().getCode());
            result.setHandoverName(handover.getHandoverType().getName());   
			result.setVer(handover.getVer());
			result.setIsActive(handover.getIsActive());
			responseDb.add(result);
		}
		final ReportResDto<HandoverDataDto> responseBe = new ReportResDto<HandoverDataDto>();
        responseBe.setIncoming(incoming);
        responseBe.setOutgoing(outgoing);
		responseBe.setData(responseDb);
		return responseBe;
    }
    
}
