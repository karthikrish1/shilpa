package multithreading;

public class th2 implements Runnable{
	public static void main(String[] args) {
		
		th2 ob= new th2();
		Thread t= new Thread(ob);
		t.start();
		
		th2 ob1= new th2();
		Thread t1= new Thread(ob1);
		t1.start();
		
	}
	
	public void run()
	{
		System.out.println("Task 1 ");
	}

}
