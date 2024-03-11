import java.util.ArrayList;
import java.util.Comparator;

public class SecondHighestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<Integer> li = new ArrayList<Integer>();
		
		li.add(32);
		li.add(12);
		li.add(48);
		li.add(32);
		li.add(8);
		li.add(5);
		
		System.out.println("Second Highest eleement:::");
		
		li.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

	}

}
