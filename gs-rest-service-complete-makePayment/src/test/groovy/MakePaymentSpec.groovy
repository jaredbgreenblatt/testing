import hello.EmailSender
import hello.PaymentNotifier
import model.Customer
import model.Payment
import model.Policy
import spock.lang.Specification

class MakePaymentSpec extends Specification {
	
	private EmailSender emailSender
	private PaymentNotifier paymentNotifier
	private Payment payment ;
	
	private Policy policy
	private Customer customer;
	
	public void setup() {
		payment = Stub(Payment.class)
		customer = Stub(Customer.class)
		emailSender = Mock(EmailSender.class)
		policy = new Policy(emailSender)
	
	
		policy.setBalance(100)
		policy.setPolicyNumber("12345")
		policy.setCustomer(customer)
		
		
	}
	
	def"Make Payment on policy"(){
		given:"Polcy Exists and has an outstanding balance"
	
		
	
		
		
		and:"Payment type is valid "
		payment.getAmount() >> 70

		
		when: "Customer applies a payment on policy"
		
		policy.makePayment(payment)
		
		then: "Balance due is decreased by current payment"
		
		policy.balance ==30
		
		
		 
		
		
	}
	
	def "Make Full Payment"(){
		given: "A policy has been paid in full"
		payment.getAmount() >> 100
		
		when: "Customer makes full payment on policy, check if email is sent"
		policy.makePayment(payment)
		
		then: "And email is sent to customer"
		
		1* emailSender.SendEmail(customer)
		
		
	}

}
