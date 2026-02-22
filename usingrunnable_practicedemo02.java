package multi_threading;

public class usingrunnable_practicedemo02 {

	public static void main(String[] args) {

		First fi = new First();
		fi.run();

	}
}

class First implements Runnable {

	@Override
	public void run() {

		int count = 0;
		while (count < 10) {
			System.out.println("\n Runnable Interface Running....!");
			count++;
		}

	}

}