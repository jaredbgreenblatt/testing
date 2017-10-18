import static org.junit.Assert.assertTrue

import model.Customer
import model.Payment
import model.Policy
import spock.lang.Specification

class MakePaymentSpec extends Specification {
	
	def"Make Payment on policy"(){
		given:"Polcy Exists and has an outstanding balance"
		Policy policy = new Policy()
		Customer customer = new Customer();
		customer.setFirstName("First")
		customer.setLastName("Last")
		policy.setBalance(100)
		policy.setPolicyNumber("12345")
		policy.setCustomer(customer)
		
	
		
		
		and:"Payment type is valid "
		Payment payment = new Payment()
		
		payment.setAmount(70)
		
		when: "Customer applies a payment on policy"
		
		policy.makePayment(payment)
		
		then: "Balance due is decreased by current payment"
		
		policy.balance ==30
		
		
		 
		
		
	}

}
