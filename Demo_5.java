package multi_threading;

public class Demo_5 {

	public static void main(String[] args) {

		int i = 0;

		for (int j = 0; j < 1000; j++) {
			i++;
		}

		for (int j = 0; j < 1000; j++) {
			i++;
		}

		System.out.println(i);
	}

}
