package algorithm;

public class VarSwiching {

	public static void main(String[] args) {

		String name = "이주영";
		String age = "25";
		String temp;
		
		System.out.println("------ 스위칭 전 ------");
		System.out.println("name = " + name);
		System.out.println("age = " + age);
		
		temp = age;
		age = name;
		name = temp;
		
		System.out.println("------ 스위칭 후 ------");
		System.out.println("name = " + name);
		System.out.println("age = " + age);
	}

}
