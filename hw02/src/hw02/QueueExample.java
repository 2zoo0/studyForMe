package hw02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	
	public static void main(String[] args) {
		
	Queue<String> queue = new LinkedList<String>();
	
	String str1 = "ù����";
    String str2 = "�ι���";
    String str3 = "�¹���";
    String str4 = "�׹���";
    
    System.out.println("offer : " + queue.offer(str1)); 
    System.out.println("offer : " + queue.offer(str2));
    System.out.println("offer : " + queue.offer(str3));
    System.out.println("offer : " + queue.offer(str4));
	
    System.out.println("peek : " + queue.peek());
    System.out.println("peek : " + queue.poll());
    System.out.println("poll : " + queue.poll());
	}
}
