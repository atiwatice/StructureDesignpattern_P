package com.adapter.test;

public interface PayD {
	public String getCustCardNo();

	public String getCardOwnerName();

	public String getCardExpMonthDate();

	public Integer getCvvNo();

	public Double getTotalAmount();

	public void setCustCardNo(String custCardNo);

	public void setCardOwnerName(String cardOwnerName);

	public void setCardExpMonthDate(String cardexpDateMonth);

	public void setCvvNo(Integer cVVNo);

	public void setTotalAmount(Double totalAmount);
}
