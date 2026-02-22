package multi_threading;

public class Demo_4 {

	public static void main(String[] args) throws Exception {
		
		Count cont = new Count();
		
		Number one = new Number();
		Number_1 two = new Number_1();
		
		one.conut=cont;
		two.conut=cont;
		 
		one.start();
		two.start();

		Thread.sleep(1000);
		System.out.println(cont.getCount());
		System.out.println();
		
		
	}

}
class Count  
{
	int count = 0;
	public void Increase()
	{
		this.count++;
	}
	
	public int getCount()
	{
		return this.count;
	}
}

class Number extends Thread
{
	 
	Count conut;
//	 Number(Count count){
//		 this.count = count; 
				// }
	 
	public void run()
	{
		for(int i=0; i<10000; i++)
		{
			conut.Increase();
		}
	}
	
}

class Number_1 extends Thread
{
	Count conut;
	public void run()
	{
		for(int i=0; i<10000; i++)
		{
			conut.Increase();
		}
	}
}