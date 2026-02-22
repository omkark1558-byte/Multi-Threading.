package multi_threading;

//import java.util.Scanner;

public class Dmeo_13 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		sc.next();

		Counter c1 = new Counter();

		Me_thread m1 = new Me_thread(c1);
		Me_thread m2 = new Me_thread(c1);

		m1.start();
		m2.start();

		try {
			m1.join();
			m2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(c1.getCount());
		
//		sc.close();
	}

}

class Counter {
	private int Count = 0;

	public synchronized void increment() {
//		synchronized(this)
//		{
		Count++;
//		}
	}

	public int getCount() {
		return Count;
	}
}

class Me_thread extends Thread {
	private Counter counter;

	Me_thread(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		for (int i = 0; i < 100000; i++) {
			counter.increment();
		}
	}

}