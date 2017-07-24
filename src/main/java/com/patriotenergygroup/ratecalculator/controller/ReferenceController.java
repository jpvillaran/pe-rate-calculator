package com.patriotenergygroup.ratecalculator.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.patriotenergygroup.ratecalculator.model.Supplier;
import com.patriotenergygroup.ratecalculator.payload.Payload;
import com.patriotenergygroup.ratecalculator.payload.PayloadFactory;
import com.patriotenergygroup.ratecalculator.service.SupplierService;

@RestController
@RequestMapping("/reference")
public class ReferenceController {

	private final Logger logger = LoggerFactory.getLogger(ReferenceController.class);
	
	@Autowired
	private SupplierService supplierService;
	
	@Autowired
	private PayloadFactory payloadFactory;
	
	@RequestMapping(value = "/supplier", method = RequestMethod.GET)
	public Payload<List<Supplier>> getSuppliers() {
		logger.info("Retrieving a list of suppliers");
		return payloadFactory.createFor(supplierService.getAllSuppliers());
	}
	
	@RequestMapping(value = "/supplier/{id}", method = RequestMethod.GET)
	public Payload<Supplier> getSupplier(@PathVariable("id") long id) {
		logger.info(String.format("Retrieving a supplier with id %l", id));
		return payloadFactory.createFor(supplierService.getSupplierById(id));
	}
}
