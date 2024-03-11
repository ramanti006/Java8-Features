//there are multiple predefined functional interface

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;  
/*class functionEx implements Function<String,Integer>
{
	public Integer apply(String s)
	{
		return s.length();
	}
}*/
public class PreDefinedFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Function<String,Integer> fun = new functionEx();
		//System.out.println(fun.apply("Ramanti"));
		
		//By using lambda function
		Function<String,Integer> fun = (String s) -> s.length();
		System.out.println(fun.apply("Ramanti"));
		
		Consumer<String> cd = (String str)-> {System.out.println("the lengthof string->"+str.length());};
		cd.accept("Ramanti");
		
		Predicate<String> pr = (String str)-> (str.length() > 5);
		System.out.println(pr.test("mithu"));

	}

}
