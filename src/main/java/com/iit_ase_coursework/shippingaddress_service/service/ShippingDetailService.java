package com.iit_ase_coursework.shippingaddress_service.service;

import com.iit_ase_coursework.shippingaddress_service.model.ShippingDetail;
import com.iit_ase_coursework.shippingaddress_service.repository.ShippingDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ShippingDetailService implements IShippingDetailService{
    @Autowired
    private ShippingDetailRepository shippingDetailRepository;
    @Override
    public List<ShippingDetail> getAllShippingDetails() {
       return this.shippingDetailRepository.findAll();
    }

    @Override
    public List<ShippingDetail> getShippingDetailsByCountry(String country) {
        return null;
    }

    @Override
    public ShippingDetail getShippingDetailById(int detailId) {
        return this.shippingDetailRepository.getOne(detailId);
    }

    @Override
    public int createShippingDetail(ShippingDetail Detail) {
        this.shippingDetailRepository.save(Detail);
        return Detail.getdetailId();
    }

    @Override
    public void updateShippingDetail(ShippingDetail Detail) {
        this.shippingDetailRepository.save(Detail);
    }

    @Override
    public void deleteShippingDetail(int detailId ) {
        this.shippingDetailRepository.deleteById(detailId);
    }

    @Override
    public List<ShippingDetail> getShippingDetailByCustomerId(int customerId) {
        List<ShippingDetail> shippingDetails = this.shippingDetailRepository.getShippingDetailByCustomerId(customerId);
        return shippingDetails;
    }
}
