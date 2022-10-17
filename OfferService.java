package com.gl.caseStudy4Application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gl.caseStudy4Application.bean.Offer;
import com.gl.caseStudy4Application.repository.OfferRepository;


@Repository
public class OfferService {
	@Autowired
	private OfferRepository repo;
	
	public List<Offer> findAllOffers() {
		List<Offer> offerList = repo.findAll();
		return offerList;
	}

	public Offer findAOffer(Long id) {
		Offer offer = repo.getById(id);
		return offer;
	}
}
