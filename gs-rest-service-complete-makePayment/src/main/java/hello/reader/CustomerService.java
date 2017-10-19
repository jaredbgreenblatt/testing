package hello.reader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.model.Customer;

@Service
public class CustomerService  {
	@Autowired
	private CustomerRepository repo;
	
	public String findFullName(String customerID){
	    Customer customer = repo.findOne(customerID);
	    return customer.getFirstName() +" "+customer.getLastName();
	  }

}
