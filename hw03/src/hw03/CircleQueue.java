package hw03;

public class CircleQueue {
	// ť �迭�� front�� rear �׸��� maxSize�� ������.
	private int front;
	private int rear;
	private int maxSize;
	private Object[] queueArray;
	
	// ť �迭 ����
	public CircleQueue(int maxSize){
		
		this.front = 0;
		this.rear = -1;
		
		// ���� ũ�⺸�� �ϳ� ũ�� �����Ѵ� (����� ��ȭ�� ���� ����)
		this.maxSize = maxSize+1;	
		this.queueArray = new Object[this.maxSize];
	}
	
	// ť�� ����ִ��� Ȯ��
	public boolean empty(){
		return (front == rear+1) || (front+maxSize-1 == rear);
	}
	
	// ť�� �� á���� Ȯ��
	public boolean full(){
		return (rear == maxSize-1) || (front+maxSize-2 == rear);
	}
	
	// ť rear�� ������ ���
	public void push(Object item){
		
		if(full()) throw new ArrayIndexOutOfBoundsException();
		
		// rear �� �迭�� �������̸� rear �����͸� ������ ������.
		if(rear == maxSize-1){
			rear = -1;
		}
		queueArray[++rear] = item;
		System.out.println(item + "pushed!!");
	}
	
	// ť���� front ������ ��ȸ
	public Object peek(){
		
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		
		System.out.println(queueArray[front] + "peeked!!");
		
		return queueArray[front];
	}
	
	// ť���� front ������ ����
	public Object remove(){
		
		System.out.println();
		Object item = peek();
		System.out.println(item + "removed!!");
		front++;
		
		// front�� ���� index�� �迭ũ��+1 �̸� ó������ ���ư���
		if(front==maxSize){
			front = 0;
		}
		return item;
	}
	
	public static void main(String[] args) {
		CircleQueue Cq = new CircleQueue(5);
		Cq.push(4);
		Cq.push(3);
		Cq.push(2);
		Cq.push(1);
		
		Cq.peek();
		
		Cq.remove();
	}
}
