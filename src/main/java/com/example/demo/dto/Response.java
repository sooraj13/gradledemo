package com.example.demo.dto;

import com.example.demo.models.Customer;

public class Response {



    private Long respCode;
    private String msg;

    private Customer cust;

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public Response(Long respCode, String msg) {
        this.respCode = respCode;
        this.msg = msg;
    }

    public Response() {
    }

    public Long getRespCode() {
        return respCode;
    }

    public void setRespCode(Long respCode) {
        this.respCode = respCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
