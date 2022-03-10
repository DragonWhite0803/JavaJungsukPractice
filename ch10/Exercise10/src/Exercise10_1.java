import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Exercise10_1 {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.of(2010, 1, 1);

		for (int i = 1; i <= 12; i++) {
			date = date.withMonth(i); // i 값으로 달 설정
			LocalDate scSun = date.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
			System.out.println(scSun.format(dtf) + "은 2번째 일요일입니다");
			//

//			date = date.withDayOfMonth(1); // 매달 1일로 초기화
//			DayOfWeek dow = date.getDayOfWeek(); // 1일은 무슨요일인지
//			int pv = 7 - dow.getValue(); // 일요일이 되기 위해 더해줘야 하는 값
//			if (dow.getValue() == 7) { // 1일이 일요일일경우
//				System.out.println((date.plusWeeks(1)).format(dtf) + "은 2번째 일요일입니다"); // 주만 +1
//			} else {
//				System.out.println((date.plusDays(pv)).plusWeeks(1).format(dtf) + "은 2번째 일요일입니다");
//				// 일요일로 만들고 주 +1
//			}

		}
	}
}

//DayOfWeekInMonth 메서드를 사용하지 않았을 경우의 구현은 주석처리 하였다