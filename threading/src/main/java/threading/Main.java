package threading;

public class Main {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Tuna());
		t1.start();
		
		t1.setName("MyThread");
		System.out.println("New Thread Name: " + t1.getName());
		System.out.println(java.time.LocalTime.now());
		
		//DemoThread1
		Thread t2 = new Thread(new DemoThread1());
		t2.start();
		
		Thread t3 = new Thread(new DemoThread1());
		t3.getName();
		
		Thread t4 = new Thread(new DemoThread1());
		t4.equals(t2);
		System.out.printf("%s equals %s", t4.getName(), t2.getName());
		
		
		//Numbers thread
		
		//multiples of 2
		Thread t5 = new Thread(new Number(2));
		t5.start();
		
		//multiples of 5
		Thread t6 = new Thread(new Number(5));
		t6.start();

		//multiples of 8
		Thread t7 = new Thread(new Number(8));
		t7.start();
		
		/*
		//multiples of 10
		Thread t8 = new Thread(new Number(10));
		t8.start(); */
	}

}
