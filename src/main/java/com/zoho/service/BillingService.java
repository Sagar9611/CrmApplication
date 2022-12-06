package com.zoho.service;

import java.util.List;

import com.zoho.entities.Billing;

public interface BillingService {
public void genrateInvoice(Billing billing);

public List<Billing> getBillings();
}
