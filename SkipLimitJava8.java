import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SkipLimitJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<Integer> li = new ArrayList<Integer>();
		
		li.add(32);
		li.add(12);
		li.add(48);
		li.add(32);
		li.add(8);
		li.add(5);
		
		System.out.println("SKip eleement:::");
		li.stream().skip(2).collect(Collectors.toList()).forEach(System.out::println);
		
		

		System.out.println("Limit eleement:::");
		li.stream().limit(4).collect(Collectors.toList()).forEach(System.out::println);
		
		//use of skip() and limit() together to retrieve 3 elements
		System.out.println("...................");
		li.stream().skip(1).limit(3).forEach(System.out::println);

	}

}
