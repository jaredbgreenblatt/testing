import hello.Calculator
import spock.lang.Specification

class CalculatorSpec extends Specification {
	
	def "Add two numbers"(){

		  given:"Two integers"
		  int a=2
		  int b=4

		  and:"A calculator class"
		  Calculator cal = new Calculator()

		  when:"They are added"
		  int sum = cal.add(a,b)

		  then:"the sum is provided"
		  sum == 6
	}
	
	def "Add two string numbers"(){
		
				  given:"Two string numbers"
				  String a="2"
				  String  b="4"
		
				  and:"A calculator class"
				  Calculator cal = new Calculator()
		
				  when:"They are added"
				  int sum = cal.add(a,b)
		
				  then:"the sum is provided"
				  sum == 6
			}
			
			def "Add two string "(){
				
						  given:"Two string numbers"
						  String a="a"
						  String  b="b"
				
						  and:"A calculator class"
						  Calculator cal = new Calculator()
				
						  when:"They are added"
						  int sum = cal.add(a,b)
				
						  then:"throw exception"
						  thrown(NumberFormatException)
					}
   
	def "Subtract two numbers"(){
		  given:" Two integers"
		  int a =2
		  int b=4
		  and: "A caluclator class"
		  Calculator cal = new Calculator()
		 
		  when:"They are subtracted "
		  int dif = cal.subtract(a,b)
		 
		  then:"the differnce of the first integer minus the second is provided"
		  dif == -2
		 
	}
   
	def "Mutiply two numbers"(){
		  given: "two integers"
		  int a =2
		  int b =4
		 
		  and: "a calculator class"
		  Calculator c = new Calculator()
		 
		  when: " they are mutiplyed "
		  int prod =c.multiply(a,b)
		 
		  then: " the product is provided"
		  prod == 8
   
		 
	}
   
   
   
	def "Divide one number by another"() {
		  given: "two integers"
		  int a=4;
		  int b=2;
		  and: "a calculator class"
		  Calculator c = new Calculator();
		  when: "one number is divided by another"
		  BigDecimal quot = c.divide(a, b)
		  then: "the quotient is produced"
		  quot == 2;
	}
   
	def "divide by zero"() {
		  given: "second int is zero"
		  int a=4;
		  int b=0;
		  and: "a calculator class"
		  Calculator c = new Calculator();
		  when: "one number is divided by 0"
		  c.divide(a, b);
		  then: "the quotient blows up"
		  thrown(ArithmeticException)
		 
	}

	
	def "Divide one String number by another"() {
		given: "two Strings"
		String a="4";
		String b="2";
		and: "a calculator class"
		Calculator c = new Calculator();
		when: "one number is divided by another"
		BigDecimal quot = c.divide(a, b)
		then: "the quotient is produced"
		quot == 2;
  }
  
  def "divide One String Number by zero"() {
	  given: "second int is zero"
	  String a=4;
	  String b=0;
	  and: "a calculator class"
	  Calculator c = new Calculator();
	  when: "one number is divided by 0"
	  c.divide(a, b);
	  then: "the quotient blows up"
	  thrown(ArithmeticException)
	 
}
}
