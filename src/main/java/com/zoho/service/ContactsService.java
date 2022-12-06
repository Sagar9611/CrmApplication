package com.zoho.service;

import java.util.List;

import com.zoho.entities.Contacts;
import com.zoho.entities.Lead;

public interface ContactsService {
public void saveContacts(Contacts contacts);

public List<Contacts> listOneContacts();

public void deleteContacts(long id);



Contacts findContacts(long id);


}
