package hello;

import java.math.BigDecimal;

public class Calculator {
	 public int add(int a, int b)
     {
           return a+ b;
     }
	 
	 public int add(String a, String b)
     {
           return Integer.parseInt(a)+ Integer.parseInt(b);
     }
    
     public int subtract(int a, int b)
     {
           return a - b;
     }
    
     public int multiply(int a, int b)
     {
           return a * b;
     }
    
     public BigDecimal divide(int a, int b)
     {
          
           return new BigDecimal(a).divide(new BigDecimal(b));
          
          
     }
     
     public BigDecimal divide(String a, String b)
     {
          
           return new BigDecimal(a).divide(new BigDecimal(b));
          
          
     }

}
