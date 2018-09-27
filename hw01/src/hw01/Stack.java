package hw01;
/**
 * Stack 구조 만들기 
 * @author Lee
 *
 */
public class Stack {
	int top = -1;
	int[] stack;
	int size;
	
	// 스택 생성자
	public Stack(int size) {
		top = -1;
		stack = new int[size];
		this.size = size;
	}
	
	// 스택 최대사이즈 검사
	public boolean full() {
		return (top + 1 >= size);
	}
	
	// peek
	public int peek() {
		return stack[top];
	}
	
	// num 을 push하기
	public void push(int num) {
		if(!full()) {
		stack[++top] = num;
		System.out.println(top + ". " +stack[top] + " Pushed!");
		} else {
			System.out.println("Over Size");
		}
	}
	
	// pop 하기
	public int pop() {
		System.out.println(top + ". " + stack[top] + " Poped!");
		return stack[top--];
	}
	
	// stack 전체 출력
	public void printStack() {
		for (int i = top; i >= 0; i--) {
			System.out.println(i + ". " +stack[i]);
		}
		System.out.println("stack 출력");
			
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
