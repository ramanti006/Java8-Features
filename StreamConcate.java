import java.util.stream.Stream;

public class StreamConcate {
	
	public static void main(String[] args) {
	
	Stream<String> stream1 = Stream.of("Geeks", "for"); 
    Stream<Integer> stream2 = Stream.of(1,2,3,4); 
    
    Stream.concat(stream1, stream2).forEach(element -> System.out.println(element)); 
	
	}

}
