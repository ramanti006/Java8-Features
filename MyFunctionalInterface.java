//FI onyl have one abstract method and multiple defalut/static methods

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface myInterface
{
	public void show();
	
	public default void name()
	{
		System.out.println("Name is Ramanti..");
	}
	
	public static void stshow()
	{
		System.out.println("It is a static method.");
	}
}

/*class ex implements myInterface
{
	public void show()
	{
		System.out.println("I am a functional Interface");	
	}
}*/
public class MyFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       myInterface fi = () ->	System.out.println("I am a functional Interface"); 
	   fi.show();
	   fi.name();
	   myInterface.stshow();
	   
	    Predicate<Integer> pr = (i) -> ( i >= 4);
		System.out.println(pr.test(5));
		
		Consumer<Integer>  cu = (i) -> System.out.println(i*2);
		cu.accept(5);
		
		Function<String,Integer> fu = (a) -> (a.length());
		System.out.println(fu.apply("Ramnti"));
		
		
		BiFunction <Float,Float,Float> Bifu = (a,b) -> (a*b);
		System.out.println(Bifu.apply(5f, 5f));
	  
	   
	}

}
