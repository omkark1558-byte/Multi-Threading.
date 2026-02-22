package multi_threading;

public class Vol_2 {
	volatile static boolean flag = true;

	public static void main(String[] args) throws InterruptedException {

		Thread Th_1 = new Thread(() -> {

			System.out.println("Thread Th 1 Is Started...!");

			while (flag) {

			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread Th 1 is Ended..!");
		});

		Th_1.start();

		Thread.sleep(1400);
		flag = false;
		System.out.println("All Thread Is Ended....!" + flag);

	}

}
