import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class mobile
{
	String name;
	int ram;
	int price ;
	
	mobile(String name,int ram,int price)
	{
		this.name = name;
		this.ram = ram;
		this.price = price;
		
	}

	@Override
	public String toString() {
		return "mobile [name=" + name + ", ram=" + ram + ", price=" + price + "]";
	}
	
	
	
}	

public class comparater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mobile  ob1 = new mobile ("samsung",12,12546);
		mobile  ob2 = new mobile ("Mi",13,10000);
		mobile  ob3 = new mobile ("Nokia",8,15422);
		
		List<mobile > li = new ArrayList<mobile>();
		li.add(ob1);
		li.add(ob2);
		li.add(ob3);
		
		Comparator ob = new Comparator<mobile>()
				{
			public int compare(mobile lap1,mobile lap2) {
				if(lap2.price > lap1.price)
				{
					return 1;
				}
				else
				{
					return -1;
				}
			} 
			};
			
			Collections.sort(li,ob);
			
			for(mobile mob : li)
			{
				System.out.println(mob);
			}

	}

}
