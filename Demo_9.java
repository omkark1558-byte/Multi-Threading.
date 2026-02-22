package multi_threading;

public class Demo_9 extends Thread {

	// Get The Program Is The Thread Life Cycle's...!

	public void run() {

		System.out.println("RUNNING");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Demo_9 T_1 = new Demo_9();
		System.out.println(T_1.getState());
		T_1.start();
		System.out.println(T_1.getState());
		Thread.sleep(100);
		System.out.println(T_1.getState());
		T_1.join();
		System.out.println(T_1.getState());
	}

}
