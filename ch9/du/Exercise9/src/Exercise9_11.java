import java.util.Scanner;

public class Exercise9_11 {
	public static void main(String[] args) {
		System.out.println("���۰��� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();

		System.out.println("������ �Է��ϼ���: ");
		int end = sc.nextInt();

		multiflex(start, end);
	}

	public static void multiflex(int start, int end) {
		if (start > end) {
			System.out.println("���۰��� �������� �۾ƾ��մϴ�.");
		} else if (start < 2 || start > 9 || end < 2 || end > 9) {
			System.out.println("2�� 9������ ���� �Է��� �ּ���");
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
