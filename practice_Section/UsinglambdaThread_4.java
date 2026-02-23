package multi_threading.practice_Section;

public class UsinglambdaThread_4 {
	 static int total = 0;

	    public static void main(String[] args) throws InterruptedException {

	        Thread task_1 = new Thread(() -> {

	            for (int i = 1; i <= 10; i++) {
	                int value = i * 3;
	                System.out.println(value);
	                total += value;
	            }
	        });

	        Thread task_2 = new Thread(() -> {
	            System.out.println("TOTAL: " + total);
	        });
	        task_1.start();
	        task_1.join();

	        task_2.start();
	    }

	}