import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Exercise10_5 {
	public static long getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyyMMdd");
		try {
			LocalDate from = LocalDate.parse(yyyymmdd1, dt);
			LocalDate to = LocalDate.parse(yyyymmdd2, dt);
			long days = to.until(from, ChronoUnit.DAYS);

			return days;
		} catch (Exception e) {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(getDayDiff("20010103", "20010101"));
		System.out.println(getDayDiff("20010103", "20010103"));
		System.out.println(getDayDiff("20010103", "200103"));
	}
}