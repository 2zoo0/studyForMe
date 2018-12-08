package algorithm;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[6];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		for (int i : array) {
			System.out.print(i);
			System.out.println();
		}
		
		// 정렬 전
		
		for (int i = 0; i < array.length; i++) { // 정렬 회차
			
			for (int j = 1; j < array.length - i; j++) {// 인접숫자 비교
				if (array[j-1] > array[j]) {
					//변수 스위칭을 이용하여 서로 바꿔줌
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}// inner for end
			
		}//outer for end
		
		for (int i : array) {
			System.out.print(i);
		}
		
		// 정렬 후
	}

}
