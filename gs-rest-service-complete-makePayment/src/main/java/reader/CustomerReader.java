package reader;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Customer;

public class CustomerReader {

	@PersistenceContext
	  private EntityManager entityManager;

	  public String findFullName(Long customerID){
	    Customer customer = entityManager.find(Customer.class, customerID);
	    return customer.getFirstName() +" "+customer.getLastName();
	  }
}
