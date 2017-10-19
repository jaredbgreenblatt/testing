package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import hello.model.Customer;
import hello.model.Payment;
import hello.model.Policy;

@RestController
@RequestMapping("/makePayment")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping(value="", method = RequestMethod.GET, produces ="application/json")
    public @ResponseBody boolean hasOustandingBalance() {
    	Policy p = new Policy();
    		
		return p.isHasOutstandingBalance();
    
    }
    
    @RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody Policy makePaymentPost(@RequestBody Payment payment, UriComponentsBuilder ucBuilder) {
      Customer customer = new Customer();
      customer.setFirstName("Chuck");
      customer.setLastName("Arnold");
    	Policy policy = new Policy();
    	policy.setBalance(2000);
    	policy.setPolicyNumber("1254683");
    	policy.setCustomer(customer);
    	policy.makePayment(payment);
      
      
       return policy;
    }
    
    
}
