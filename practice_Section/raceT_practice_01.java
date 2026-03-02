package multi_threading.practice_Section;

public class raceT_practice_01 {

	public static void main(String[] args) throws InterruptedException {

		Uni task = new Uni();
		Uni task_2 = new Uni();

		Hoest thread = new Hoest(task);
		Hoest thread2 = new Hoest(task_2);

		thread.start();
		thread2.start();
		thread.join();
		thread2.join();

		System.out.println(task.getNuming());
		System.out.println(task_2.getNuming());

	}

}

class Uni extends Thread {
	private int Numing = 0;

	public synchronized void Increment() {
		Numing++;
	}

	public void Decrement() {
		Numing--;
	}

	public int getNuming() {
		return Numing;
	}
}

class Hoest extends Thread {
	private Uni uni;

	Hoest(Uni uni) {
		this.uni = uni;
	}

	public void run() {
		try {
			Thread.sleep(5600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i <= 30; i++) {
			uni.Increment();
			System.out.println("J"+i);
		}
	}

}
