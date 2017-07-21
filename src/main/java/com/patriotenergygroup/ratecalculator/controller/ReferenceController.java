package com.patriotenergygroup.ratecalculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.patriotenergygroup.ratecalculator.model.Supplier;
import com.patriotenergygroup.ratecalculator.service.SupplierService;

@RestController
@RequestMapping("/reference")
public class ReferenceController {

	@Autowired
	private SupplierService supplierService;
	
	@RequestMapping(value = "/supplier", method = RequestMethod.GET)
	public List<Supplier> getSuppliers() {
		return supplierService.getAllSuppliers();
	}
	
	@RequestMapping(value = "/supplier/{id}", method = RequestMethod.GET)
	public Supplier getSupplier(@PathVariable("id") long id) {
		return supplierService.getSupplierById(id);
	}
}
