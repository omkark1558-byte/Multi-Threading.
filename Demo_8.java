package multi_threading;

public class Demo_8 {

	public static void main(String[] args) throws InterruptedException {

		Interpeter obj_t = new Interpeter();
		Interpeter obj_t_1 = new Interpeter();
		Interpeter obj_t_2 = new Interpeter();
		Interpeter obj_t_3 = new Interpeter();
		Interpeter obj_t_4 = new Interpeter();
		Interpeter obj_t_5 = new Interpeter();

		First_below ones = new First_below(obj_t);
		Sec_below twoo = new Sec_below(obj_t_1);
		First_below ones_1 = new First_below(obj_t_2);
		Sec_below twoo_2 = new Sec_below(obj_t_3);
		First_below ones_3 = new First_below(obj_t_4);
		Sec_below twoo_4 = new Sec_below(obj_t_5);

//		ones.count = obj_t;
		ones.start();
		twoo.start();
		ones_1.start();
		twoo_2.start();
		ones_3.start();
		twoo_4.start();

		ones.join();
		twoo.join();
		ones_1.join();
		twoo_2.join();
		ones_3.join();
		twoo_4.join();

		Thread.sleep(450);

		System.out.println(obj_t.getInterpeter());
		System.out.println(obj_t_1.getInterpeter());
		System.out.println(obj_t_2.getInterpeter());
		System.out.println(obj_t_3.getInterpeter());
		System.out.println(obj_t_4.getInterpeter());
		System.out.println(obj_t_5.getInterpeter());

	}

}

class Interpeter {
	int count = 0;

	public synchronized void Increase() {
		this.count++;
	}

	public int getInterpeter() {
		return this.count;
	}
}

class First_below extends Thread {
	Interpeter count;

	First_below(Interpeter count) {
		this.count = count;
	}

	public void run() {

		for (int i = 0; i < 8000; i++) {
			count.Increase();
		}
	}
}

class Sec_below extends Thread {

	Interpeter count;

	Sec_below(Interpeter count) {
		this.count = count;
	}

	public void run() {

		for (int i = 0; i < 8000; i++) {
			count.Increase();
		}
	}
}