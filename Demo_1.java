package multi_threading;

public class Demo_1 {

	public static void main(String[] args) throws Exception {

		Multiple mul = new Multiple();
		Multiple mul_1 = new Multiple();
		Multiple mul_2 = new Multiple();
		Multiple mul_3 = new Multiple();
		Multiple mul_4 = new Multiple();

//		mul.run();

		mul.start();
		mul_1.start();
		mul_2.start();
		mul_3.start();
		mul_4.start();

		int count = 1;
		while (count < 20) {
			Thread.sleep(1500);
			System.out.println("Willed The Fun Calling...⚠️");
			count++;
		}

	}

}

class Multiple extends Thread {
	public void run() {
		try {
			for (int i = 1; i < 10; i++) {
				Thread.sleep(1400);
				System.out.println("Hlw ..");
			}
		} catch (Exception ex) {
			System.out.println("Throw The Exception...!");
		}
	}
}