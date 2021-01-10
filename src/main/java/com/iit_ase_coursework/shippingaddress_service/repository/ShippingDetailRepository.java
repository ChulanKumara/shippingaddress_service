package com.iit_ase_coursework.shippingaddress_service.repository;

import com.iit_ase_coursework.shippingaddress_service.model.ShippingDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface ShippingDetailRepository extends JpaRepository<ShippingDetail,Integer> {
    @Query("select l from ShippingDetail l where l.customerId = :customerId")
    ArrayList<ShippingDetail> getShippingDetailByCustomerId(@Param("customerId") int customerId);
}
