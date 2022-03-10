import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise10_4 {
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		String pattern2 = "입력하신 날짜는 E요일 입니다.";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(pattern2);
		Scanner sc = new Scanner(System.in);

		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요");

		while (sc.hasNextLine()) {
			try {
				LocalDate date = LocalDate.parse(sc.nextLine(), dtf);
				System.out.println(date.format(dtf2));
			} catch (Exception e) {
				System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요");
			}

		}
	}
}
