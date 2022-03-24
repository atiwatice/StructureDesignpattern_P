package com.adapter.test;

public class RunAdapterExample {
	public static void main(String[] args) {
		Xpay xpay = new XpayImpl();
		xpay.setAmount(2345.56);
		xpay.setCardCvvNo((short) 123);
		xpay.setCardexpMonth("09");
		xpay.setCardExpyear("2024");
		xpay.setCreditCardNo("123456789");
		xpay.setCustomerName("Ravi");

		PayD payD = new XpayToPayDAdapter(xpay);
		testPayD(payD);
	}

	private static void testPayD(PayD payD) {
		System.out.println(payD.getCardExpMonthDate());
		System.out.println(payD.getCardOwnerName());
		System.out.println(payD.getCustCardNo());
		System.out.println(payD.getCvvNo());
		System.out.println(payD.getTotalAmount());

	}
}
