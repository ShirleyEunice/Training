package lambda;

public class LambdaClass {
	static String printThing(Printable thing) {
		return thing.print("Edge");
	}
	public static void main(String args[])
	{
		//printThing(()-> System.out.println("This is lambda expression"));
		
		//Printable lambaPrinciple=(p,s) -> System.out.println("This is lambda expression");
		/*Printable lambaPrinciple=s -> {
			System.out.println("Expression" + s);
			return "wiley";		
		};*/
	Printable lambaPrinciple=s->{
		return "Wiley " + s;
	};
	
	System.out.println(printThing(lambaPrinciple));		
	}

}

/*Benefits of Lambda Expression
 1. To enable functional program in java
 2. To make code readable and maintainable
 3. To enable parallel processing
 4. JAR file size reduction.
 5. Eliminate shadow variables
 
*/
