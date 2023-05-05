/**
 * 
 */
package thurdasay0405;
public class EqualClass {
	public static void main(String[] args) {
		int a=4;
		int b=4;
		
		if(a==b)
		{
			System.out.println("The numbers are equal");
		}else
		{
			System.out.println("The numbers are not equal");
		}
		
		String s1=new String("Wiley");
		String s2=new String("Wiley");
		
		if(s1==s2)
		{
			System.out.println("The strings are equal");
		}else
		{
			System.out.println("The strings are not equal");
		}
		
		//because each string objects are stored in different place in heap memory
		//that is they have different address
		
		String str1="Wiley";
		String str2="Wiley";
		
		if(str1==str2)
		{
			System.out.println("They are equal");
		}else
		{
			System.out.println("They are not same");
		}
		
		if(str1.equals(str2)) {
			System.out.println("same");
		}else {
			System.out.println("Different");
		}
		
		Dog myDog =new Dog();
		Dog yourDog=new Dog();
		
		if(myDog.equals(yourDog))
		{
			System.out.println("same");
		}else
		{
			System.out.println("Not same");
		}

	}

}
