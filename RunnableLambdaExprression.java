//Runnable interface is a functional interface
class ThreadDemo implements Runnable
{

	public void run()
	{
		System.out.println("Run method is running...");
	}
}
public class RunnableLambdaExprression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo th = new ThreadDemo();
		
		Thread t = new Thread(th);
		t.start();
		
		Thread a = new Thread(()->System.out.println("run method"));
		a.start();
		
	}

}
