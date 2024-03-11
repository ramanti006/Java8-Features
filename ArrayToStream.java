import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,4,5,6};
		
		IntStream st = Arrays.stream(arr);
		//st.forEach(System.out::println);
		
		Stream<Integer> str = st.boxed();
		//str.forEach(System.out::println);
		
		System.out.println(str.findAny().get());
		
		//Stream to Array ,toList(),toArray()
		Object[] arr1 = str.toArray();
		for(Object i : arr1)
		{
			System.out.println(i);
		}

	}

}
