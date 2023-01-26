package com.lawencon.parcelhandover.dto.response;

public class TransactionResDto<T> {
    
    private T data;
    
    private String message;
    
    public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
