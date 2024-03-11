import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Add2everyNthElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(2,4,5,6,7,8,5);
		
		//One way to do it 
		List<Integer> modifiedList = IntStream.range(0, numbers.size())
                .mapToObj(i -> (i % 2 == 1) ? numbers.get(i) + 2 : numbers.get(i))
                .collect(Collectors.toList());
		
		System.out.println(modifiedList);
		
		//Another way to do it
		IntStream.range(0, numbers.size())
		.filter(i -> i%2 == 1)
		.forEach(i -> numbers.set(i, numbers.get(i) + 2));
		
		numbers.forEach(System.out::println);

	}

}
