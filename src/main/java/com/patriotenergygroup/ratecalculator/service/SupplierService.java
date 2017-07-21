package com.patriotenergygroup.ratecalculator.service;

import java.util.List;

import com.patriotenergygroup.ratecalculator.model.Supplier;

public interface SupplierService {
	Supplier getSupplierById(long id);
	List<Supplier> getAllSuppliers();
}
