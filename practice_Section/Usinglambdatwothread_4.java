package multi_threading.practice_Section;

public class Usinglambdatwothread_4 {
	 public static void main(String[] args) throws InterruptedException {
	        Thread task_1 = new Thread(() -> {
	            for (int i = 0; i <= 50; i++) {
	                try {
	                    Thread.sleep(150);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                System.out.println("SIMPLE NUM: " + i);
	            }
	        });
	        Thread task_2 = new Thread(() -> {

	            for (int i = 0; i <= 50; i++) {
	                if (i % 2 == 0) {
	                    System.out.println("\n EVEN NU: " + i);
	                }
	            }
	        });
	        task_1.start();
	        task_2.start();
	        task_1.join();
	        task_2.join();
	    }
}
