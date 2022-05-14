package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name="CUST")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long custId;

    private String custName;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Customer(Long custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }

    public Customer() {
    }
}
