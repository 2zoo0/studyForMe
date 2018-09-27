package hw01;

public class NineNine {

	public static void main(String[] args) {
		int stage, times, line;
		stage = 2;
		times = 9;
		line = 5;

		// 구구단을 외자
		for (int k = line; k <= times; k+=2) {
			for (int j = 1; j < times; j++) {
				for (stage = k-2; stage <= k; stage++) {
					System.out.printf("%d * %d = %2d  ", stage, j, j * stage);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
