package multi_threading;

public class ExplicitLockdemo1 {

	public static void main(String[] args) {
	 

		Bankaccount SBI = new Bankaccount();
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				SBI.withdraw(10);

			}
		};
		Thread t1 = new Thread(task , "Thread 1");
		Thread t2 = new Thread(task , "Thread 2");
		t1.start();
		t2.start();
		
	}

}
class Bankaccount {
	
	private int balance = 100;
	
	public synchronized void withdraw(int amount)
	{
		System.out.println(Thread.currentThread().getName()+" Attempting to Withdraw "+ amount);
		if(balance >= amount)
		{
			System.out.println(Thread.currentThread().getName() + " Proceeding with Withdrawal");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " completed withdrawal. Reamining balanace: "+balance);
		}else {
			System.out.println(Thread.currentThread().getName()+" insufficient balalance");

		}
	}
}
