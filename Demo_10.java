package multi_threading;

public class Demo_10 {

	public static void main(String[] args) throws Exception {

		// Print The Logical Program For The 1 Thread Print The (EVEN No)  And 2 Thread is Print (Sum).....! 
		
		Thread t1 = new Thread(() -> {

			for (int i = 0; i <=100; i++) {
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i % 2 == 0) {
					System.out.println("Even Number : " + i);
				}
			}
		});

		Thread t2 = new Thread(() -> {
			int sum = 0;
			for (int i = 0; i <=100; i++) {
				sum += i;
			}
			System.out.println("Total Submission : " + sum);
		});

		t1.start();
		t2.start();
	}
}
