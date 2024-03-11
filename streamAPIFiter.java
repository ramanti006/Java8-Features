import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class streamAPIFiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<product> proinfo = new ArrayList<product>();
		
		int[] arr = {2,4,5,6,10,17};
		List<Integer> li = IntStream.of(arr).filter(ele->ele%2 == 0).boxed().collect(Collectors.toList());
		System.out.println(li);

		

	}

}
