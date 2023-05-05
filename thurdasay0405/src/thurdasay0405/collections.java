/**
 * 
 */
package thurdasay0405;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class collections {
	public static void main(String[] args) {
		int arr[]= {3,6,21,43,3,24,52,12,4};
		Arrays.sort(arr);
		
		for(int i:arr){
			System.out.println(i);			
		}
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(45);
		a.add(32);
		a.add(12);
		a.add(27);
		
		Collections.sort(a);
		
		System.out.println(a);
		

	}

}
