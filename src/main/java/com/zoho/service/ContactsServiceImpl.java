package com.zoho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entities.Contacts;
import com.zoho.entities.Lead;
import com.zoho.repositories.ContactsRepository;
import com.zoho.repositories.LeadRepository;
@Service
public class ContactsServiceImpl implements ContactsService {
	@Autowired
private ContactsRepository cr;
	@Override
	public void saveContacts(Contacts contacts) {
		cr.save(contacts);
		
	}
	@Override
	public List<Contacts> listOneContacts() {
		List<Contacts> contacts = cr.findAll();
		return contacts;
	}
	@Override
	public void deleteContacts(long id) {
		cr.deleteById(id);
		
	}

	@Override
	public Contacts findContacts(long id) {
		Optional<Contacts> findById = cr.findById(id);
		Contacts contacts = findById.get();
		return contacts;
		
	}
	

}
