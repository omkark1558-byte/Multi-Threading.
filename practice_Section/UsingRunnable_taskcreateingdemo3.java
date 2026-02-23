package multi_threading.practice_Section;

public class UsingRunnable_taskcreateingdemo3 {
	public static void main(String[] args) {

		Table tsk = new Table();
		Thread th = new Thread(tsk);
		th.start();

	}
}

class Table implements Runnable {
	public void run() {

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(450);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\n Table: " + i * 2);
		}

	}
}
