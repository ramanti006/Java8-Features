import java.util.List;
import java.util.stream.Collectors;

public class filterRealExample {
	
	public static List<employee> getTaxEmployee()
	{
		List<employee> li1 = EmpFilter.getAllEmployee().stream()
				.filter((emp)-> emp.getSalary() >= 500000)
				.collect(Collectors.toList());
		
		return li1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(filterRealExample.getTaxEmployee());
	}

}
