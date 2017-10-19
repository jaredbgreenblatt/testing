

import hello.model.Customer
import hello.reader.CustomerRepository
import hello.reader.CustomerService
import spock.lang.Specification

class CustomerReaderSpec extends Specification {

	public void "customer full name is formed from first name and last name"() {
		given: "a customer with example name values"
		Customer sampleCustomer = new Customer()
		sampleCustomer.firstName ="Susan"
		sampleCustomer.lastName="Ivanova"
	
		and: "an customer repository that always returns this customer"
		CustomerRepository repo = Stub(CustomerRepository.class)
		repo.findOne("1") >> sampleCustomer
	
	
		and: "a customer reader which is the class under test"
		CustomerService customerService = new CustomerService()
		customerService.repo = repo
	
		when: "we ask for the full name of the customer"
		String fullName = customerService.findFullName("1")
	
		then: "we get both the first and the last name"
		fullName == "Susan Ivanova"
	  }
}
