package threading;

import java.util.*;

//public class Tuna implements Runnable {
public class Tuna extends Thread{
	
	String name = Thread.currentThread().getName();
	int time = 10;
	
	public void run() {
		
		String name2 = Thread.currentThread().getName();
		
		System.out.println("Current Thread Name: " + name);    
		
		try {
			System.out.printf("%s is sleeping for %d seconds\n", name, time);
			System.out.println(java.time.LocalTime.now());
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		} catch(Exception e) {
			
		}
	}
}
