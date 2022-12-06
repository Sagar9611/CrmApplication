package com.zoho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entities.Billing;
import com.zoho.repositories.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
private BillingRepository br;
	@Override
	public void genrateInvoice(Billing billing) {
		br.save(billing);

	}
	@Override
	public List<Billing> getBillings() {
		List<Billing> billing = br.findAll();
		return billing;
	}

}
