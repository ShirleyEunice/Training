//Map is thread safe
//It has three synchronized classes:
//1. HashTable apply lock at method level
//2. SynchronizedMap apply lock at object level
//3. ConcurrentHashMap apply lock at block level or bucket level
		
package thurdasay0405;

import java.util.HashMap;//class
import java.util.Map;//interface

public class mapClasses {
	public static void main(String[] args) {
		Map<String, String> ss=new HashMap<String, String>();
		
		//adding key with values
		//map allows one key as null but allows multiple null for values
		ss.put("a","A");
		ss.put("b","B");
		ss.put("c","C");
		ss.put(null,null);
		ss.put("t",null);
		ss.put("g",null);
		ss.put(null,"i");
		
		System.out.println(ss);
		
		
		//Using hash map employee name and id are added and displayed
		//It internally uses object hashing
		//Take only one Unique key and duplicate values
        HashMap<String, Integer> empId=new HashMap<String, Integer>();
        
        //adding key and values to the hashmap
        empId.put("Ashwin",101);
        empId.put("bala",103);
        empId.put("Catherin",109);
        empId.put("David",111);
        empId.put("Ashwin",105);
        
        
        System.out.println(empId);//printing all the details
        System.out.println(empId.get("bala"));//getting values from particular key
        System.out.println(empId.containsKey("David"));//checking whether the key is available
        System.out.println(empId.containsValue(109));//Checking whether the value is available
       
        //replace value
        empId.replace("David",112);
        System.out.println(empId);
        
        //Putting value if the key is absent        
        empId.putIfAbsent("Charlie", 67);
        System.out.println(empId);
        
        //removing key from the hash map
        empId.remove("Ashwin");
        System.out.println(empId);
        
	}

}
