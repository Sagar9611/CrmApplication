package com.zoho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entities.Lead;
import com.zoho.repositories.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
private LeadRepository lr;
	@Override
	public void saveLeads(Lead lead) {
		lr.save(lead);
	}
	@Override
	public List<Lead> listOneLead() {
		List<Lead> leads = lr.findAll();
		return leads;
	}
	@Override
	public void deleteLead(long id) {
		lr.deleteById(id);
	}
	@Override
	public Lead findLead(long id) {
		Optional<Lead> findById = lr.findById(id);
		Lead lead = findById.get();
		return lead;
		
	}

}
