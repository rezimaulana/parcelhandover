package com.lawencon.parcelhandover.dto.response;

import java.util.List;

public class ReportResDto<T> {
    
    private String incoming;

    private String outgoing;
    
    private List<T> data;

    public String getIncoming() {
        return incoming;
    }

    public void setIncoming(String incoming) {
        this.incoming = incoming;
    }

    public String getOutgoing() {
        return outgoing;
    }

    public void setOutgoing(String outgoing) {
        this.outgoing = outgoing;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

}
