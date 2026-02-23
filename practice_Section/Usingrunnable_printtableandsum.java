package multi_threading.practice_Section;

public class Usingrunnable_printtableandsum {

	public static void main(String[] args) {

		Table_printer_1 task = new Table_printer_1();
		table_sum task2 = new table_sum();

		Thread t1 = new Thread(task, "Table THread");
		Thread t2 = new Thread(task2, "SUM THread");

		t1.start();
		t2.start();
	}
}

class Table_printer_1 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(i * 2);
		}

	}

}

class table_sum implements Runnable {

	@Override
	public void run() {

		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			sum += i;
			System.out.println("TOTAL SUM: " + sum);
		}

	}

}