import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1,2,4,5,6};
		
		IntStream st = Arrays.stream(arr);
		//st.forEach(System.out::println);
		
		Stream<Integer> str = st.boxed();
		//str.forEach(System.out::println);
		
		Optional<Integer> i = str.reduce((first,secnd) -> secnd);
		
		System.out.println(i.get());

	}

	
}
