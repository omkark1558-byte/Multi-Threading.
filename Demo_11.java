package multi_threading;

public class Demo_11 {

	public static void main(String[] args) {

		Infinite b = new Infinite();
		Thread t1 = new Thread(b);
		t1.start();

		for (int i = 0; i < 10; i++) {
			System.err.println(Thread.currentThread().getName());
		}

	}

}

class Infinite implements Runnable {

	public void run() {
		for (int j = 0; j < 10; j++) {
			System.out.println("Hlw");
		}
	}
}
