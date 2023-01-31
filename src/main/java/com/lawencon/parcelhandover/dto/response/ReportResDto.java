package com.lawencon.parcelhandover.dto.response;

import java.math.BigDecimal;
import java.util.List;

public class ReportResDto<T> {
    
    private BigDecimal incoming;

    private BigDecimal outgoing;
    
    private List<T> data;

    public BigDecimal getIncoming() {
        return incoming;
    }

    public void setIncoming(BigDecimal incoming) {
        this.incoming = incoming;
    }

    public BigDecimal getOutgoing() {
        return outgoing;
    }

    public void setOutgoing(BigDecimal outgoing) {
        this.outgoing = outgoing;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

}
