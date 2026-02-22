package multi_threading;

public class Vol_1 {

	volatile static boolean flag = true;

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {
			System.out.println("Thread T1 is Statarted...!");
			while (flag) {
				try {
					Thread.sleep(1000); // Yaha Tak Flag True Rahtea hai Bad Me false Ho Jata Hai ..!
				} catch (Exception e) {
					System.out.println("Exception Throw's...!");
				}

			}
			System.out.println("Thread T1 is Ended....⚠️");
		});

		t1.start();

		Thread.sleep(1500);

		flag = false;
		System.out.println("Flag is Now False :" + flag);
	}

}
