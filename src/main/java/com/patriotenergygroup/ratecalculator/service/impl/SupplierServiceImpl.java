package com.patriotenergygroup.ratecalculator.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patriotenergygroup.ratecalculator.model.Supplier;
import com.patriotenergygroup.ratecalculator.repository.SupplierRepository;
import com.patriotenergygroup.ratecalculator.service.SupplierService;;

@Service("supplierService")
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	SupplierRepository supplierRepository;

	@Override
	public Supplier getSupplierById(long id) {
		return supplierRepository.findOne(id);
	}

	@Override
	public List<Supplier> getAllSuppliers() {
		return supplierRepository.findAll();
	}
}
