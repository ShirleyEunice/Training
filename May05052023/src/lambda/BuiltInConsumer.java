package lambda;

import java.util.function.BiConsumer;

public class BuiltInConsumer {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> el= (Integer age, Integer percentage)-> {
			if(age > 18 && percentage > 75) {
				System.out.println("You are eligible for the job");
				
			}else {
				System.out.println("You are not eligible for the job");
			}
		};
		
		el.accept(16, 78);

	}

}
