import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class laptop implements Comparable<laptop>
{
	String name;
	int ram;
	int price ;
	
	laptop(String name,int ram,int price)
	{
		this.name = name;
		this.ram = ram;
		this.price = price;
		
	}
    
	@Override
	public int compareTo(laptop lap) {
		if(this.price > lap.price)
		{
			return 1;
		}
		else if(this.price < lap.price)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	@Override
	public String toString() {
		return "laptop [name=" + name + ", ram=" + ram + ", price=" + price + "]";
	}
	
	
	
}	

public class comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		laptop ob1 = new laptop("HP",12,12546);
		laptop ob2 = new laptop("DELL",13,10000);
		laptop ob3 = new laptop("AUS",8,15422);
		
		List<laptop> li = new ArrayList<laptop>();
		li.add(ob1);
		li.add(ob2);
		li.add(ob3);
		
		
		Collections.sort(li);
		
		for(laptop g: li)
		{
			System.out.println(g);
		}
	}
}
