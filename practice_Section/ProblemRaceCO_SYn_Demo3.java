package multi_threading.practice_Section;

public class ProblemRaceCO_SYn_Demo3 {

	public static void main(String[] args) throws InterruptedException {

		Bank_Account Task = new Bank_Account();
		
		First_Thread Task_1 = new First_Thread(Task);
		Second_Thread Task_2 = new Second_Thread(Task);
		
		Task_1.start();
		Task_2.start();
		
		Task_1.join();
		Task_2.join();
		
		System.out.println(Task.getCount());
		System.out.println(Task.getCount());
	}

}

class Bank_Account {
	int Count;

	public synchronized void Incress() {
		this.Count++;
	}

	public int getCount() {
		return Count;
	}
}

class First_Thread extends Thread {

	Bank_Account count;

	public First_Thread(Bank_Account count) {
		this.count = count;
	}

	public void run() {
		try {
			Thread.sleep(1500);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		for (int i = 0; i < 1000; i++) {
			count.Incress();
		}
	}

}

class Second_Thread extends Thread {
	Bank_Account count;

	public Second_Thread(Bank_Account count) {
		this.count = count;
	}

	public void run() {
		try {
			Thread.sleep(1500);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		for (int j = 0; j < 1500; j++) {
			count.Incress();
		}
	}
}
