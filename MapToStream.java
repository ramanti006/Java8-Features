import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class MapToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("App", 2);
		map.put("ball", 5);
		map.put("bird", 3);
		
		System.out.println(map);
		
		Stream<Entry<String, Integer>> st = map.entrySet().stream();
		
		st.forEach(System.out::println);

	}

}
