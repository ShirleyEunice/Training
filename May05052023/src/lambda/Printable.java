package lambda;

@FunctionalInterface
public interface Printable {

	//void print(String prefix,String suffix);//abstract
	String print(String suffix);//abstract method(can be used once)
	
	default void addfiles() {//default method(can use multiple method)
		
	}
	public static void sayOk() {//static method(can use multiple method)
		
	}
	//void getName();
	/*By using functional interface, we can pass functions as parameters instead 
	 * of reference object
	 * It allows only single abstract method to execute but allows
	 *  multiple default and static method */


}
