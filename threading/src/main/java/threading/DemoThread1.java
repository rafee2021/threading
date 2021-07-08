package threading;

import java.util.*;

//public class DemoThread1 implements Runnable {
public class DemoThread1 extends Thread {
	
	public void run() {		
		
		Random r = new Random();
		int counter = r.nextInt(10);
		
		try {
			System.out.println("running child Thread in loop : " + counter);
			Thread.sleep(2);
		} catch (Exception e) {
			
		}
	}
}
