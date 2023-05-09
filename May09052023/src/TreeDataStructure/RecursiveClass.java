package TreeDataStructure;
// Recursive is the technique of function call itself
//factorial

//5 * 5-1(4)
//20 * 4-1(3)

public class RecursiveClass {
	static int factorial(int n) {
		if(n==1) {
			return 1;
		}else
		{
			return (n*factorial(n-1));
		}
	}

	public static void main(String[] args) {
		System.out.println("Factorial of 5 is: "+factorial(5));
		

	}

}
