package multi_threading.practice_Section;

public class raceT_practice_01 {

	public static void main(String[] args) throws InterruptedException {

		Uni task = new Uni();

		Hoest thread = new Hoest(task);
		Hoest thread2 = new Hoest(task);

		thread.start();
		thread2.start();
		thread.join();
		thread.join();

		System.out.println(task.getNuming());

	}

}

class Uni extends Thread {
	private int Numing = 0;

	public synchronized void Increment() {
		Numing++;
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
		for (int i = 0; i <3000; i++) {
			uni.Increment();
		}
	}

}
