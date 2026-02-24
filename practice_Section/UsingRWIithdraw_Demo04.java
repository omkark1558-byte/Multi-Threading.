package multi_threading.practice_Section;

public class UsingRWIithdraw_Demo04 {

	public static void main(String[] args) throws InterruptedException {

		Bankaccount_1 HDFC = new Bankaccount_1();
		Runnable task2 = new Runnable() {
			public void run() {
				HDFC.withdraw(20);
			}
		};
		Thread task = new Thread(task2);
		Thread task_01 = new Thread(task2);

		task.start();
		Thread.sleep(1500);
		task_01.start();

		task.join();

	}

}

class Bankaccount_1 {
	private int balance = 10;

	public synchronized void withdraw(int amount) {

		System.out.println(Thread.currentThread().getName() + " Attemting Balance: " + amount);
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + "Proceesing Withdrawing Amount..!");

			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= amount;
		}

		else {
			System.out.println(Thread.currentThread().getName() + " Insuffcient balabnce..🎭");
		}
	}
}
