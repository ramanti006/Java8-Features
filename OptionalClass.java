import java.util.*;

public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = null;
		String st = "Ramanti";
		int a = 0;
		Optional <String> op = Optional.ofNullable(st);
		System.out.println(op.orElse("Null value present"));
		

	}

}
