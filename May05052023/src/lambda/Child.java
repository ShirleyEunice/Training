package lambda;
@FunctionalInterface
public interface Child extends Parent{
	public void sayHello();/*the parent abstract method name should be called in 
	child method as same*/
	
	default void sayHi() {//default method can be called in any name like here, sayHi
		
	}
	//methods of object class
	String toString();
	int hashCode();
	boolean equals(Object obj);

}
