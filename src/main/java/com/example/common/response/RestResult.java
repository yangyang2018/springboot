package com.example.common.response;


public class RestResult {
	
	private String response_code;//00 成功
	private String error_msg;
	private Object data;
	
	
	public String getResponse_code() {
		return response_code;
	}

	public String getError_msg() {
		return error_msg;
	}

	public Object getData() {
		return data;
	}

    public RestResult success() {
        this.response_code = "00";
        this.error_msg = "";
        this.data = null;
        return this;
    }

    public RestResult success(Object data) {  
        this.response_code = "00";  
        this.error_msg = "";  
        this.data = data;  
        return this;  
    } 
    
    public RestResult success(String code, String msg, Object data) {  
        this.response_code = code;  
        this.error_msg = code;  
        this.data = data;  
        return this;  
    } 
    
    public RestResult failure(String code, String msg) {  
        this.response_code = code;  
        this.error_msg = msg;  
        return this;  
    } 

	

}
