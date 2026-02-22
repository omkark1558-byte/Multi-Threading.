package multi_threading;

public class Demo_3 {

	public static void main(String[] args) throws Exception {

		Number_Printer Obj = new Number_Printer();

		Obj.start();
		Obj.join();

		Numeber_printers Obj_0 = new Numeber_printers();
		Obj_0.start();
		Obj_0.join();
		
		

	}

}

class Number_Printer extends Thread {

	public void run() {
		for (int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(750);
			} catch (InterruptedException ex) {
				System.out.println("Throw Exception...!");
			}
			System.out.println("Tabel's : " + 2 * i);
			System.out.println("_____________________");
		}
	}
}

class Numeber_printers extends Thread {
	public void run() {
		int count = 2;
		while (count <= 20) {
			try {
				Thread.sleep(750);
			} catch (InterruptedException ex) {
				System.out.println("Exception....!");
			}
			System.out.println("Even No : " + count);
			count = count + 2;
		}
	}
}