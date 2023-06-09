package lambda;

@FunctionalInterface
interface Calc{
	//Abstract method
	int calculate(int val);
}

public class FunctionalInterfaceClass {

	public static void main(String[] args) {
		// let's implement abstract method of the calc interface
		Calc cl=(int val)-> val+54;
		
		//call the method
		System.out.println("Result: "+ cl.calculate(54));

	}

}
