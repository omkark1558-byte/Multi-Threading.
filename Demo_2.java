package multi_threading;

public class Demo_2 {

	public static void main(String[] args) {
		Thread obj = new Thread(() -> {
			for (int i = 1; i <= 10; i++)
				System.out.println(2 * i);
		});
		obj.start();
		try {
			obj.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		Thread obj_2 = new Thread(() -> {
			for (int i = 2; i <= 500; i++)
				System.out.println(i);
		});
		obj_2.start();
		try {
			obj_2.join();
		} catch (InterruptedException r) {

		}
	}

}