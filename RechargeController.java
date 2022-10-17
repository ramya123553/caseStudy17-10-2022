package com.gl.caseStudy4Application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.caseStudy4Application.bean.Bill;
import com.gl.caseStudy4Application.bean.Offer;
import com.gl.caseStudy4Application.service.BillService;
import com.gl.caseStudy4Application.service.OfferService;



@RestController
public class RechargeController {
	@Autowired
	private OfferService offerService;
	
	@Autowired
	private BillService billService;
	
	@GetMapping("index")
	public ModelAndView showIndex() {
		ModelAndView mv = new ModelAndView("index");
		List<Offer> offerList = offerService.findAllOffers();
		mv.addObject("offerList",offerList);
		return mv;
	}
	
	@GetMapping("bill")
	public ModelAndView showBill(@RequestParam("mobileNum") String mobileNum, @RequestParam("radio") Long id) {
		ModelAndView mv = new ModelAndView("billView");
		Offer resOffer = offerService.findAOffer(id);
		Long transactionId = billService.generateId();
		mv.addObject("resOffer", resOffer);
		mv.addObject("mobileNum", mobileNum);
		mv.addObject("transactionId", transactionId);
		
		Bill bill = new Bill();
		bill.setMobileNumber(Integer.parseInt(mobileNum));
		bill.setOfferId(id);
		bill.setTransactionId(transactionId);
		
		billService.billSave(bill);
		return mv;
	}
}