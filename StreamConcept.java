import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*List<Integer> li1 = Arrays.asList(1,2,45,6);
		
		Stream<Integer> st = li1.stream();
		st.forEach(System.out::println);
		
		//from Array
		String[] arr = {"A","B","C"};
		Stream<String> s = Arrays.stream(arr);
		s.forEach(System.out::println);
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 4);
		
		map.entrySet().stream().forEach(System.out::println);*/
		
		List<Integer> li = Arrays.asList(10,11,1,5,20,1,4,10,5);
		
		//List<String> newli = li.stream().map(i -> String.valueOf(i)).filter(a -> a.startsWith("1")).collect(Collectors.toList());
		Set<Integer> set = new HashSet();
        /*li.stream()
              .filter(n -> !set.add(n))
              .forEach(System.out::println);*/
		
		List<Integer> newli = li.stream().distinct().collect(Collectors.toList());
		System.out.println(newli);
		
	    

	}

}
