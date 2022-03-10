import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise10_4 {
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		String pattern2 = "�Է��Ͻ� ��¥�� E���� �Դϴ�.";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(pattern2);
		Scanner sc = new Scanner(System.in);

		System.out.println("��¥�� " + pattern + "�� ���·� �Է����ּ���");

		while (sc.hasNextLine()) {
			try {
				LocalDate date = LocalDate.parse(sc.nextLine(), dtf);
				System.out.println(date.format(dtf2));
			} catch (Exception e) {
				System.out.println("��¥�� " + pattern + "�� ���·� �Է����ּ���");
			}

		}
	}
}
