package package1;

public class Class1 {

	public static void main(String[] args) {

		
		GreetingService s = (name)->System.out.println("Hi"+name);
	
	    s.greet("vinoth");
	    s.greet("sandeep");
	    GreetingService d = (actual)->System.out.println("Hello"+ " " +actual.length());
	    d.greet("Sandeep");
d.greet("Saandeep");
		
	}
}


