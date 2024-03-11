//functional interface which is having 1 abstract method
interface akar
{
	void shape();
}

/*class rectangle implements akar
{
	public void shape()
	{
		System.out.print("I am rectangle");
	}
}*/

class square implements akar
{
	public void shape()
	{
		System.out.print("I am square");
	}
	
}

public class lambdaFunction {

	public static void main(String[] args) {
		
		akar rc = () -> System.out.println("I am rectangle");
		rc.shape();
		
		akar circle = () -> System.out.println("I am circle");
		circle.shape();
		
		

	}

}
