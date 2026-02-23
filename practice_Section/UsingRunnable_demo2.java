package multi_threading.practice_Section;

public class UsingRunnable_demo2 {
	public static void main(String[] args) {

		Table_printer task = new Table_printer();
		task.run();
	}

}

class Table_printer implements Runnable {

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(850);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i * 2);
		}
	}

}
