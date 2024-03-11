import java.util.ArrayList;
import java.util.List;

public class EmpFilter {
	
	public static List<employee> getAllEmployee()
	{
		List<employee> li = new ArrayList<employee>();
		li.add(new employee(102,"IT",500000));
		li.add(new employee(103,"BPO",20000));
		li.add(new employee(104,"IT",700000));
		li.add(new employee(105,"IT",800000));
		li.add(new employee(106,"BPO",300000));
		
		return li;
		
	}

}
