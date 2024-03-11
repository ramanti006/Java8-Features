import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(11);
		arr.add(22);
		arr.add(11);
		arr.add(22);
		arr.add(1);
		arr.add(2);
		
		System.out.println(arr);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		//show only dublicate list
		//List<Integer> newarr = arr.stream().filter((s) -> !hs.add(s)).collect(Collectors.toList());
		
		//remove dublicate list
		List<Integer> newarr = arr.stream().filter((s) -> hs.add(s)).collect(Collectors.toList());
		
		System.out.println(newarr);

	}

}
