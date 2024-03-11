import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        List<Integer> li = new ArrayList<Integer>();
        
        li.add(23);
        li.add(52);
        li.add(25);
        li.add(55);
        li.add(55);
        //li.forEach(System.out::println);
        
        //Map<Boolean, List<Integer>> newli = li.stream().collect(Collectors.groupingBy(i -> i >= 30));
        
        //System.out.println(newli);
        
        int c = (int) li.stream().filter(e -> e == 12).count();
        
        System.out.println(c);

	}

}
