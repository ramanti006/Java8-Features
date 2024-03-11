
import java.util.function.BiFunction;
class Example
{
	public static int add(int a , int b)
	{
		return a+b;
	}
}
public class MethodReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer, Integer, Integer>adder = Example::add;
		System.out.println("Add of two integer->"+adder.apply(10,20));

	}

}
