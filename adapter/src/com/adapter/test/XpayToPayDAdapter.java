package com.adapter.test;

public class XpayToPayDAdapter implements PayD {
	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonth;
	private Integer cvvNo;
	private Double totalAmount;

	private final Xpay xpay;

	public XpayToPayDAdapter(Xpay xpay) {
		this.xpay = xpay;
		setProperties();
	}

	private void setProperties() {
		setCardOwnerName(this.xpay.getCustomerName());
		setCustCardNo(this.xpay.getCreditCardNo());
		setCardExpMonthDate(this.xpay.getCardexpMonth() + "-" + this.xpay.getCardExpyear());
		setCvvNo((int) this.xpay.getCardCvvNo());
		setTotalAmount(this.xpay.getAmount());

	}

	@Override
	public String getCustCardNo() {
		return custCardNo;
	}

	@Override
	public String getCardOwnerName() {
		return cardOwnerName;
	}

	@Override
	public String getCardExpMonthDate() {
		return cardExpMonth;
	}

	@Override
	public Integer getCvvNo() {
		return cvvNo;
	}

	@Override
	public Double getTotalAmount() {
		return totalAmount;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}

	@Override
	public void setCardExpMonthDate(String cardexpDateMonth) {
		this.cardExpMonth = cardexpDateMonth;
	}

	@Override
	public void setCvvNo(Integer cVVNo) {
		this.cvvNo = cVVNo;
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
}
