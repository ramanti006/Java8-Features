import java.util.ArrayList;
import java.util.Comparator;

public class MaxMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> li = new ArrayList<Integer>();
		
		li.add(32);
		li.add(12);
		li.add(48);
		li.add(32);
		li.add(8);
		
		//many ways of finding max
		int mx1 = li.stream().max((X,Y) -> X.compareTo(Y)).get();
		int mx2 = li.stream().max(Comparator.naturalOrder()).get();
		
		System.out.println("The max element :"+mx1);
		
		//many ways of finding min
		int mi1 = li.stream().min(Comparator.naturalOrder()).get();
		int min2 = li.stream().min((X,Y) -> X.compareTo(Y)).get();
		
		System.out.println("The min element :"+mi1);

	}

}
