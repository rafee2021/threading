package threading;

import java.util.*;

public class Number implements Runnable {

	int k;
	
	public Number(int j) {
		k = j;
	}
	
	public void run () {
		
		//does not print list in correct order	
		//modifying code makes the print inconsistent
		
		try {
			
			System.out.printf("Starting thread for %d\n", k);
			
			for (int i = 0; i < 5; i++) {
				System.out.println(k * i);
			}
			
			System.out.printf("Finished thread for %d\n", k);
			Thread.sleep(10); 
			
		} catch(Exception e) {
			
		}
	}
}
