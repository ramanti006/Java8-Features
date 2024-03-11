import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		List<Integer>
// li = Arrays.asList(10,15,8,49,25,98,32,8,15);
//		
//		Set<Integer> set = new HashSet();
		//List<Integer> newli = li.stream().filter((s -> Collections.frequency(li, s) >= 2) -> !set.add(s)).collect(Collectors.toList());
		
		//Map<Integer, Long> mp = li.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
//	  List<Integer> num = li.stream().filter( s -> set.add(s)).sorted().skip(1).collect(Collectors.toList());
//	   System.out.println(num);
//		String str = "I am am right girl";
//		
//		Map<String, Long> myStream = Arrays.stream((str.split(" "))).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		
//		System.out.println(myStream);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(11);
		arr.add(22);
		arr.add(11);
		arr.add(22);
		arr.add(1);
		arr.add(2);
		
		System.out.println(arr);
		
		Map<Integer, Long> hs = arr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(hs);
		
	}
	
}
