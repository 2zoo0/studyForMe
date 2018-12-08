package hw02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	
	public static void main(String[] args) {
		
	Queue<String> queue = new LinkedList<String>();
	
	String str1 = "첫번쨰";
    String str2 = "두번쨰";
    String str3 = "셋번쨰";
    String str4 = "네번쨰";
    
    System.out.println("offer : " + queue.offer(str1)); 
    System.out.println("offer : " + queue.offer(str2));
    System.out.println("offer : " + queue.offer(str3));
    System.out.println("offer : " + queue.offer(str4));
	
    System.out.println("peek : " + queue.peek());
    System.out.println("peek : " + queue.poll());
    System.out.println("poll : " + queue.poll());
	}
}
