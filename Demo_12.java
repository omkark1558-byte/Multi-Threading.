package multi_threading;

public class Demo_12 {
	public static void main(String[] args) {

		// Set Priority...!
		thread_practice t1 = new thread_practice("Highest Priority");
		thread_practice t2 = new thread_practice("Medimum Priority");
		thread_practice t3 = new thread_practice("Low Priority");

		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
		t3.start();

	}

}

class thread_practice extends Thread {

	public thread_practice(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {

//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				System.out.println(e); }
			System.out.println("------------------------------");
			System.out.println(
					Thread.currentThread().getName() + "- priority : " + Thread.currentThread().getPriority() + i);
		}
	}
}