package multi_threading.practice_Section;

public class threadingbasic_practicedemo01 {

	public static void main(String[] args) throws InterruptedException {
			
		thread_1 task1= new thread_1();
		thread_2  task2= new thread_2();
		task1.start();
		task1.join();
		task2.start();
		task2.join();
	}

}

class thread_1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=100;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
}
class thread_2 extends Thread
{
	public void run()
	{
		int count = 0;
		while(count < 20)
		{
			System.out.println(count);
			count++;
		}
		
	}
}