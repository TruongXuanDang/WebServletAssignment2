package com.demo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Integer id;

    @Column(name = "userId")
    private Integer userId;

    @Column(name = "customername")
    private String customername;

    @Column(name = "address")
    private String address;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "description")
    private String description;

    @Column(name = "createat")
    private java.sql.Timestamp createat;

    @Column(name = "updateat")
    private java.sql.Timestamp updateat;

    @Column(name = "deleteat")
    private java.sql.Timestamp deleteat;

    @Column(name = "orderstatus")
    private Integer orderstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.sql.Timestamp getCreateat() {
        return createat;
    }

    public void setCreateat(java.sql.Timestamp createat) {
        this.createat = createat;
    }

    public java.sql.Timestamp getUpdateat() {
        return updateat;
    }

    public void setUpdateat(java.sql.Timestamp updateat) {
        this.updateat = updateat;
    }

    public java.sql.Timestamp getDeleteat() {
        return deleteat;
    }

    public void setDeleteat(java.sql.Timestamp deleteat) {
        this.deleteat = deleteat;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

}
