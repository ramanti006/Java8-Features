import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class streamSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = new ArrayList<Integer>();
	    li.add(12);
	    li.add(15);
	    li.add(0);
	    li.add(1);
	    
	    System.out.println(li);
	    
	    //it will print in assending order
	    li.stream().sorted().forEach(System.out::println);
	    
	    //it will print in desending order
	    li.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		

	}

}
