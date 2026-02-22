package multi_threading;

public class Demo_7 {

	public static void main(String[] args) throws InterruptedException {

		Printer Obj = new Printer();
		Printer Obj_2 = new Printer();

		Switch_on ons = new Switch_on(Obj);
		Switch_of ofs = new Switch_of(Obj_2);

		ons.start();
		ofs.start();

		Thread.sleep(4500);

		System.out.println(Obj.getPrinter());
		System.out.println(Obj_2.getPrinter());

	}

}

class Printer {
	int counter = 0;

	public void Incresed() {

		this.counter++;

	}

	public int getPrinter() {
		return this.counter;
	}
}

class Switch_on extends Thread {
	Printer counter;

	Switch_on(Printer counter) {
		this.counter = counter;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			counter.Incresed();
		}
	}
}

class Switch_of extends Thread {
	Printer counter;

	Switch_of(Printer counter) {
		this.counter = counter;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			counter.Incresed();
		}
	}
}