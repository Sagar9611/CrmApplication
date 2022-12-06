package com.zoho.service;

import java.util.List;

import com.zoho.entities.Lead;

public interface LeadService {
public void saveLeads(Lead lead);

public List<Lead> listOneLead();

public void deleteLead(long id);

public Lead findLead(long id);
}
