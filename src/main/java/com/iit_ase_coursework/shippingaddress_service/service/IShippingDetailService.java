package com.iit_ase_coursework.shippingaddress_service.service;

import com.iit_ase_coursework.shippingaddress_service.model.ShippingDetail;

import java.util.ArrayList;
import java.util.List;

public interface IShippingDetailService {
    public List<ShippingDetail> getAllShippingDetails();
    public List<ShippingDetail> getShippingDetailsByCountry(String country);
    public ShippingDetail getShippingDetailById(int detailId);
    public int createShippingDetail(ShippingDetail Detail);
    public void updateShippingDetail(ShippingDetail Detail);
    public void deleteShippingDetail(int detailId);
    public List<ShippingDetail> getShippingDetailByCustomerId(int customerId);
}
