package lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BIFunction {
	public static void main(String args[]) {
		UnaryOperator<Integer> uo=a ->a^1;
		System.out.println(uo.apply(0));
		
		BinaryOperator<Integer> bn=(a,b) ->a&b;
		System.out.println(bn.apply(18, 6));
		
	}

}
