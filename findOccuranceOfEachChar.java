import java.util.Map;
import java.util.stream.Collectors;

public class findOccuranceOfEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Iamrightnowcoming";
		
		Map<Character ,Long> mp = s.chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(e -> e,Collectors.counting()));	
		
		System.out.println(mp);
	}

}
