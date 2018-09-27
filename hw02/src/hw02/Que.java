package hw02;

public class Que {
	
	int front;
	
	int rear;
	
	int maxSize = 5;
	
	Object[] queue;
	
	
	// Object 를 담는 큐 배열 생성자
	public Que() {
		this.front = 0;
		this.rear = -1;
		this.maxSize = maxSize;
		this.queue = new Object[maxSize];
	}
	
	// 큐가 비었는지 꽉찼는지 확인
	public boolean full() {
		if(rear == maxSize-1)System.out.println("Fulled...");
		return (rear == maxSize-1);
	}
	public boolean empty() {
		if(front == rear+1)System.out.println("queue is empty...");
		return (front == rear+1);
	}
	
	public void push(Object data) {
		if (!full()) {
			queue[++rear] = data;
			System.out.println(data + "pushed!!");
		} else full();
	}
	
	// front 조회
	public Object peek() {
		if (!empty()) {
			System.out.print(queue[front]+ " peek!!");
			return queue[front];
		} else {
			return null;
		}
	}
	
	// 제거
	public Object pop() {
		Object data = peek();
		front++;
		System.out.println(" and pop!!");
		return data;
		
		
	}
	public static void main(String[] args) {
		Que que = new Que();
		que.peek();
		que.push(1);
		que.push(2);
		que.push(3);
		que.push(4);
		que.push(4);
		que.push(4);
		
		que.peek();
		que.pop();
		que.pop();
		que.peek();
		que.pop();
		que.pop();
		que.peek();
	}
	
	
}
