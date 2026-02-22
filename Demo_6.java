package multi_threading;

 
public class Demo_6 {

	public static void main(String[] args) throws Exception {
		
		Counter_I obj = new Counter_I();
		
		Num_fir on = new Num_fir(obj);
		Num_sec off = new Num_sec(obj);

		on.start();
		off.start();
		 
		Thread.sleep(1500);
		System.out.println(obj.getCounter_I());
	 
	}

}

class Counter_I {
	int count = 0;

	public void Increse() {
		this.count++;
	}

	public int getCounter_I() {
		return this.count;
	}
}

class Num_fir extends Thread {
	Counter_I con;

	Num_fir(Counter_I con) {
		this.con = con;
	}

	public void run() {
		for (int i = 0; i < 10000000; i++) {
			con.Increse();
		}
	}
}

class Num_sec extends Thread {
	Counter_I con;

	Num_sec(Counter_I con) {
		this.con = con;
	}

	public void run() {
		for (int i = 0; i < 10000000; i++) {
			con.Increse();
		}
	}
}