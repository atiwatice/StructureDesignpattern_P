package com.adapter.test;

public class XpayImpl implements Xpay {
	private String creditCardno;
	private String customerName;
	private String cardExpMonth;
	private String cardExpYear;
	private short cvv;
	private Double amount;

	@Override
	public String getCreditCardNo() {
		return creditCardno;
	}

	@Override
	public String getCustomerName() {
		return customerName;
	}

	@Override
	public String getCardexpMonth() {
		return cardExpMonth;
	}

	@Override
	public String getCardExpyear() {
		return cardExpYear;
	}

	@Override
	public short getCardCvvNo() {
		return cvv;
	}

	@Override
	public Double getAmount() {
		return amount;
	}

	@Override
	public void setCreditCardNo(String creditCardNo) {
		this.creditCardno = creditCardNo;
	}

	@Override
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public void setCardexpMonth(String expMonth) {
		this.cardExpMonth = expMonth;
	}

	@Override
	public void setCardExpyear(String expyear) {
		this.cardExpYear = expyear;
	}

	@Override
	public void setCardCvvNo(short cvv) {
		this.cvv = cvv;
	}

	@Override
	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
