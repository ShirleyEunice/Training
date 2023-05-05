package lambda;
import java.util.HashMap;
import java.util.function.Function;
import java.util.*;

public class BuiltInFunction {
	//Creating HashMap to store employees info
	
	private static HashMap<Integer, String> Employee=new HashMap<Integer, String>();
	
	public static void add(String name, Integer ID)
	{
		if(!Employee.containsKey(ID)) {
			Employee.put(101,"Ashwin");
			
		}else
		{
			System.out.println("Employee already regristered");
		}
		
	}
	public static void main(String args[]) {
		//function to get name of the employee name
		Function<Integer, String> get=(Integer ID)->{
			if(Employee.containsKey(ID)) return Employee.get(ID);
			else
				return "Invalid ID";
		};
		
		//Add employee into hash map by calling the add function
		
		add("Ashwin",101);
		add("Bala",102);
		add("Catherin",103);
		add("David",104);
		add("Edwin",105);
		
		System.out.println("ID=101, NAME= "+get.apply(101));
		
	}

}
