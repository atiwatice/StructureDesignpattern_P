package com.adapter.test;

public interface Xpay {
	public String getCreditCardNo();

	public String getCustomerName();

	public String getCardexpMonth();

	public String getCardExpyear();

	public short getCardCvvNo();

	public Double getAmount();

	public void setCreditCardNo(String creditCardNo);

	public void setCustomerName(String customerName);

	public void setCardexpMonth(String expMonth);

	public void setCardExpyear(String expyear);

	public void setCardCvvNo(short cvv);

	public void setAmount(Double amount);
}
