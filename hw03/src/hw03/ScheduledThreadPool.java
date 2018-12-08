package hw03;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
	public static void main(String[] args) {
		
	ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(10);
	scheduler.schedule(new Hi(), 3, TimeUnit.SECONDS);
	Hi hi = new Hi();
	scheduler.schedule(hi, 3, TimeUnit.SECONDS);
	scheduler.scheduleAtFixedRate(new Hello(), 5, 3, TimeUnit.SECONDS);
	}
}

class Hi implements Runnable {
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hi...");
	}
}
class Hello implements Runnable {
	 public void run() {
		 // TODO Auto-generated method stub
		 System.out.println("Hello...");
	 }
 }
