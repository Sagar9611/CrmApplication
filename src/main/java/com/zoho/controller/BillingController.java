package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entities.Billing;
import com.zoho.entities.Contacts;
import com.zoho.entities.Lead;
import com.zoho.service.ContactsService;
import com.zoho.service.BillingService;
@Controller
public class BillingController {
	@Autowired
	private ContactsService cs;
@Autowired
private BillingService bs;

	@RequestMapping("/billingInfo")
	public String  createBilling(@RequestParam("id")long id,Model model) {
		Contacts contacts = cs.findContacts(id);
		model.addAttribute("contact", contacts);                                      
		return "create_billing";
	}
	@RequestMapping("/genrateBill")
	public String genrateBill(@ModelAttribute("billing")Billing billing,Model model) {
		 bs.genrateInvoice(billing);
		 return "create_billing";
	}
	//http://localhost:8080/listbills
	@RequestMapping("/listbills")
	public String listBills(Model model) {
		List<Billing> billing = bs.getBillings();
		model.addAttribute("billing", billing);
		return "bill_list";
	}
	
		
}
