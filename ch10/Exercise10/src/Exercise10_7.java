import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Exercise10_7 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, 12, 27);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		LocalDate fSun = date.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.TUESDAY));

		System.out.println(fSun.format(dtf));
	}
}
