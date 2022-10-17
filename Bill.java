package com.gl.caseStudy4Application.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bill_offer")
public class Bill {
	@Id
	private Long transactionId;
	private Integer mobileNumber;
	private Long offerId;
	
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(Long transactionId, Integer mobileNumber, Long offerId) {
		super();
		this.transactionId = transactionId;
		this.mobileNumber = mobileNumber;
		this.offerId = offerId;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Long getOfferId() {
		return offerId;
	}

	public void setOfferId(Long offerId) {
		this.offerId = offerId;
	}

	
}
