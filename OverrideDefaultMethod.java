//we can override the default method from funtionalInterface

@FunctionalInterface
interface car
{
	void showCarName();
	
	default void showCarShowRoom()
	{
		System.out.println("It is in kolkata");
	}
	
	
}

class customer implements car
{
	public void showCarName()
	{
		System.out.println("The car name is Mahindra");
	}
	
	@Override
	public void showCarShowRoom()
	{
		System.out.println("It is in Mumbai");
	}
	
}

public class OverrideDefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		customer ob = new customer();
		ob.showCarShowRoom();

	}

}
