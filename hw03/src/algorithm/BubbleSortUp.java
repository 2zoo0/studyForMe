package algorithm;

import java.util.Scanner;

public class BubbleSortUp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[6];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		for (int i : array) {
			System.out.print(i);
		}
		System.out.println();
		
		// ���� ��
		
		int cnt = 0;
		for (int i = 0; i < array.length; i++) { // ���� ȸ��
			cnt = 0;
			for (int j = 1; j < array.length - i; j++) {// �������� ��
				if (array[j-1] > array[j]) {
					//���� ����Ī�� �̿��Ͽ� ���� �ٲ���
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
					cnt++;
				}
			}// inner for end
			if (cnt == 0) {
				break;
			}
			System.out.println(i+1 + "ȸ������ ������ �Ϸ�Ǿ����ϴ�.");
			
		}//outer for end
		
		for (int i : array) {
			System.out.print(i);
		}
		
		// ���� ��
	}

}
