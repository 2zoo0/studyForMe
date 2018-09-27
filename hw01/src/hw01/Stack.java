package hw01;
/**
 * Stack ���� ����� 
 * @author Lee
 *
 */
public class Stack {
	int top = -1;
	int[] stack;
	int size;
	
	// ���� ������
	public Stack(int size) {
		top = -1;
		stack = new int[size];
		this.size = size;
	}
	
	// ���� �ִ������ �˻�
	public boolean full() {
		return (top + 1 >= size);
	}
	
	// peek
	public int peek() {
		return stack[top];
	}
	
	// num �� push�ϱ�
	public void push(int num) {
		if(!full()) {
		stack[++top] = num;
		System.out.println(top + ". " +stack[top] + " Pushed!");
		} else {
			System.out.println("Over Size");
		}
	}
	
	// pop �ϱ�
	public int pop() {
		System.out.println(top + ". " + stack[top] + " Poped!");
		return stack[top--];
	}
	
	// stack ��ü ���
	public void printStack() {
		for (int i = top; i >= 0; i--) {
			System.out.println(i + ". " +stack[i]);
		}
		System.out.println("stack ���");
			
	}
	public static void main(String[] args) {
		Stack st = new Stack(5);
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		st.push(0);
		st.push(-1);
		st.printStack();
		
		st.peek();
		st.peek();
		st.pop();
		st.pop();
		st.pop();
		st.push(7);
		st.printStack();
	}
}
