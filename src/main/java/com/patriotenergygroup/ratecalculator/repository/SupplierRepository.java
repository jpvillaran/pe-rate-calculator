package com.patriotenergygroup.ratecalculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patriotenergygroup.ratecalculator.model.Supplier;

@Repository("supplierRepository")
public interface SupplierRepository extends JpaRepository<Supplier, Long>{

}
