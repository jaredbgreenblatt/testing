package hello.reader;




import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import hello.model.Customer;
@RepositoryRestResource
public interface CustomerRepository extends PagingAndSortingRepository<Customer, String> {

//	@PersistenceContext
//	  private EntityManager entityManager;

//	  public String findFullName(Long customerID){
//	    Customer customer = entityManager.find(Customer.class, customerID);
//	    return customer.getFirstName() +" "+customer.getLastName();
//	  }
	
}
