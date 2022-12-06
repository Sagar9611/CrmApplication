package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entities.Contacts;
import com.zoho.entities.Lead;
import com.zoho.service.ContactsService;
import com.zoho.service.LeadService;

@Controller
public class LeadController {
	@Autowired        
	
	private LeadService ls;
	@Autowired        
	
	private ContactsService cs;
	
	//http://localhost:8080/create
	@RequestMapping ("/create") 
	public String createLeads() {
		return"create_leads";
	}
	
	@RequestMapping("/saveLeads")
	public String saveLeadInfo(@ModelAttribute("lead") Lead lead,Model model) {
		ls.saveLeads(lead);
		model.addAttribute("lead", lead);
		model.addAttribute("message", "Lead is Saved and Details are as follows:");
		return "lead_info";
	}
	//http://localhost:8080/listleads
		@RequestMapping ("/listleads") 
	public String listLeads(Model model) {
			List<Lead> leads = ls.listOneLead();
			model.addAttribute("leads", leads);
		return "list_leads";
	}
		@RequestMapping("/delete")
		public String deleteOneLead(@RequestParam("id") long id,Model model) {
			ls.deleteLead(id);
			List<Lead> leads = ls.listOneLead();
			model.addAttribute("leads", leads);
		return "list_leads";
		}
		@RequestMapping("/delete1")
		public String deleteOneContacts(@RequestParam("id") long id,Model model) {
			cs.deleteContacts(id);
			List<Contacts> contact = cs.listOneContacts();
			model.addAttribute("contact", contact);
			return "list_contacts";
		}
		@RequestMapping("/lead_info")
		public String findLead(@RequestParam("id") long id,Model model) {
			Lead lead = ls.findLead(id);
			model.addAttribute("lead", lead);
			return "lead_info";
		}
		@RequestMapping("/convertLead")
		public String convertLead(@RequestParam("id") long id,Model model) {
			Lead lead = ls.findLead(id);
			Contacts contacts = new Contacts();
			contacts.setId(lead.getId());
			contacts.setName(lead.getName());
			contacts.setEmail(lead.getEmail());
			contacts.setMobile(lead.getMobile());
			contacts.setSource(lead.getSource());
			cs.saveContacts(contacts);
			ls.deleteLead(id);
			List<Contacts> contact = cs.listOneContacts();
			model.addAttribute("contact", contact);
			return "list_contacts";
		}
}
