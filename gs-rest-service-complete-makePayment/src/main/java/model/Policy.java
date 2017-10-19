package model;

import hello.EmailSender;

public class Policy {
	private String policyNumber;
	private Customer customer;
	private double balance;
	
	private final EmailSender es;
	
	public Policy(final EmailSender es)
	{
		this.es = es; 
	}
	
	private void makePayment(Payment payment) {
		balance -= payment.getAmount();
	
		if (!isHasOutstandingBalance()) {
			
			es.SendEmail(this.customer);
		}
	}
	

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isHasOutstandingBalance() {
		
		return balance > 0 ;
	}

	
	
	
	

}
