package com.lawencon.parcelhandover.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lawencon.parcelhandover.dao.ReportDao;
import com.lawencon.parcelhandover.model.Handover;

@Repository
public class ReportDaoImpl extends BaseDaoImpl implements ReportDao {

    @Override
    public BigDecimal sumParcel(String startDate, String endDate, String handoverTypeCode) {
        final String sql = "SELECT SUM(h.parcel_quantity) FROM handover h "
            + "LEFT JOIN handover_type ht ON h.handover_type_id = ht.id "
            + "LEFT JOIN warehouses w ON h.warehouse_id = w.id "
            + "LEFT JOIN user_vehicle uv ON h.user_vehicle_id = uv.id "
            + "LEFT JOIN users u ON uv.user_id = u.id "
            + "LEFT JOIN vehicles v ON uv.vehicle_id = v.id "
            + "WHERE arrival_time >= TO_TIMESTAMP(:startDate, 'YYYY-MM-DD HH24:MI:SS') "
            + "AND arrival_time < TO_TIMESTAMP(:endDate, 'YYYY-MM-DD HH24:MI:SS') "
            + "AND ht.code = :handoverTypeCode ";
        BigDecimal result = (BigDecimal) this.em.createNativeQuery(sql)
            .setParameter("startDate", startDate)
            .setParameter("endDate", endDate)
            .setParameter("handoverTypeCode", handoverTypeCode)
            .getSingleResult();
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Handover> dataInOut(String startDate, String endDate) {
        final String sql = "SELECT * FROM handover h "
            + "LEFT JOIN handover_type ht ON h.handover_type_id = ht.id "
            + "LEFT JOIN warehouses w ON h.warehouse_id = w.id "
            + "LEFT JOIN user_vehicle uv ON h.user_vehicle_id = uv.id "
            + "LEFT JOIN users u ON uv.user_id = u.id "
            + "LEFT JOIN vehicles v ON uv.vehicle_id = v.id "
            + "WHERE arrival_time >= TO_TIMESTAMP(:startDate, 'YYYY-MM-DD HH24:MI:SS') "
            + "AND arrival_time < TO_TIMESTAMP(:endDate, 'YYYY-MM-DD HH24:MI:SS') ";
		final List<Handover> result = this.em.createNativeQuery(sql, Handover.class)
				.setParameter("startDate", startDate)
                .setParameter("endDate", endDate)
                .getResultList();
		return result;
    }



}
