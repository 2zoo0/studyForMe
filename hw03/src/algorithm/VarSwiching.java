package algorithm;

public class VarSwiching {

	public static void main(String[] args) {

		String name = "���ֿ�";
		String age = "25";
		String temp;
		
		System.out.println("------ ����Ī �� ------");
		System.out.println("name = " + name);
		System.out.println("age = " + age);
		
		temp = age;
		age = name;
		name = temp;
		
		System.out.println("------ ����Ī �� ------");
		System.out.println("name = " + name);
		System.out.println("age = " + age);
	}

}
