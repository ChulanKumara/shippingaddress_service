package com.iit_ase_coursework.shippingaddress_service.model;

import javax.persistence.*;

@Table(name = "tb_shipping_Detail")
@Entity
public class ShippingDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int detailId;
    String addressLine1;
    String addressLine2;
    String addressLine3;
    String country;
    String zipCode;
    String contactNo;
    int customerId;

    public int getdetailId() {
        return detailId;
    }

    public void setdetailId(int detailId) {
        this.detailId = detailId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public int getcustomerId() {
        return customerId;
    }

    public void setcustomerId(int customerId) {
        this.customerId = customerId;
    }
}
