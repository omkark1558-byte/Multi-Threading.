package multi_threading.practice_Section;

public class Usinglambda_Demo14 {
	
	public static void main(String[] args) throws InterruptedException {

        Number_printer num_obj = new Number_printer("O");
        Number_printer num_obj2 = new Number_printer("M");
        Number_printer num_obj3 = new Number_printer("K");

        num_obj.start();
        num_obj.join();

        System.out.println("***");

        num_obj2.start();
        num_obj2.join();

        System.out.println("***");

        num_obj3.start();

    }

}

class Number_printer extends Thread {
    
//	String name;

    Number_printer(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Execute The thread...!");
        for (int i = 0; i <= 25; i++) {
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}

