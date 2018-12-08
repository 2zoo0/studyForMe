package hw03;

import java.util.Scanner;

public class Parents {
	int abc = 123;

	
	
	public Parents(int abc) {
		super();
		this.abc = abc;
	}

	public int getAbc() {
		return abc;
	}

	public void setAbc(int abc) {
		this.abc = abc;
	}
	
	public static void main(String[] args) {
		Parents pp = new Son(1);
		Parents ss = (Parents)new Son(1);
		
		
		System.out.println("부모"+pp.getAbc());
		System.out.println("자식"+ss.getAbc()+ss.getClass());
		
		Scanner input = new Scanner(System.in);
		String s = input.next();
	}
}

class Son extends Parents{
	int def = 456;
	public Son(int abc) {
		super(abc);
		// TODO Auto-generated constructor stub
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
	
}
