package hw01;

import java.util.Scanner;

 
public class NewStack {
    static final int MAX_N = 100;
 
    static int top;
    static int stack[] = new int[MAX_N];
 
    static void stackInit()
    {
        top = 0;
    }
 
    static boolean stackIsEmpty()
    {
        return (top == 0);
    }
 
    static boolean stackIsFull()
    {
        return (top == MAX_N);
    }
 
    static boolean stackPush(int value)
    {
        if (stackIsFull())
        {
            System.out.println("stack overflow!");
            return false;
        }
        stack[top] = value;
        top++;
        System.out.printf("[%d]를 스택에  푸시했습니다. %n", value);
        return true;
    }
 
    static Integer stackPop()
    {
        if (top == 0) 
        {
            System.out.println("stack is empty!");
            return null;
        }
 
        top--;      
        Integer value = new Integer(stack[top]);
 
        return value;
    }
 
    public static void main(String arg[]) throws Exception {
    	System.out.println("테스트 횟수를 골라주세요.");
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
        
        for (int test_case = 1; test_case <= T; test_case++)
        {
        	System.out.println(test_case + "번 스택입니다. \n스택의 칸 수를 입력해주세요.");
            int N = sc.nextInt();
 
            stackInit();
            for (int i = 0; i < N; i++) 
            {
                int value = sc.nextInt();
                stackPush(value);
            }
 
            System.out.println("스택을 출력합니다.");
            System.out.print("#" + test_case + "번 스택 \n");
 
            while (!stackIsEmpty())
            {
                Integer value = stackPop();
                if (value != null)
                {
                    System.out.print(value.intValue() + " pop! \n");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
