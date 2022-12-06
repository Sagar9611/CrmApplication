package com.zoho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zoho.entities.Contacts;
import com.zoho.entities.Lead;
@Repository
public interface ContactsRepository extends JpaRepository<Contacts, Long> {

}
