package com.iit_ase_coursework.shippingaddress_service.controller;

import com.iit_ase_coursework.shippingaddress_service.model.ShippingDetail;
import com.iit_ase_coursework.shippingaddress_service.service.IShippingDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShippingDetailController {
    @Autowired
    private IShippingDetailService shippingDetailService;

    @PostMapping("/shippingdetail")
    public void create(@RequestBody ShippingDetail Detail){
        this.shippingDetailService.createShippingDetail(Detail);
    }
    @PatchMapping("/shippingdetail")
    public void update(@RequestBody ShippingDetail Detail){
        this.shippingDetailService.updateShippingDetail(Detail);
    }
    @GetMapping("/shippingdetail")
    public List<ShippingDetail> get(){
       return this.shippingDetailService.getAllShippingDetails();
    }
    @GetMapping("/shippingdetail/{detailId}")
    public ShippingDetail get(@PathVariable int detailId){
      return   this.shippingDetailService.getShippingDetailById(detailId);
    }
    @DeleteMapping("/shippingdetail/{detailId}")
    public void delete(@PathVariable int detailId){
          this.shippingDetailService.deleteShippingDetail(detailId);
    }
    @GetMapping("/shippingdetail/cus/{customerId}")
    public List<ShippingDetail> getByCustomerId(@PathVariable int customerId){
        return this.shippingDetailService.getShippingDetailByCustomerId(customerId);
    }

}
