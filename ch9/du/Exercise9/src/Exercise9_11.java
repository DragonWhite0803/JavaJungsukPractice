import java.util.Scanner;

public class Exercise9_11 {
	public static void main(String[] args) {
		System.out.println("시작값을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();

		System.out.println("끝값을 입력하세요: ");
		int end = sc.nextInt();

		multiflex(start, end);
	}

	public static void multiflex(int start, int end) {
		if (start > end) {
			System.out.println("시작값은 끝값보다 작아야합니다.");
		} else if (start < 2 || start > 9 || end < 2 || end > 9) {
			System.out.println("2와 9사이의 수를 입력해 주세요");
		} else {
			for (int i = start; i <= end; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + "*" + j + "=" + i * j);
				}
				System.out.println("");
			}
		}
	}
}
