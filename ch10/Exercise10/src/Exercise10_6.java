import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise10_6 {
	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(2000, 8, 3);
		LocalDate now = LocalDate.now();
		long days = birthday.until(now, ChronoUnit.DAYS);

		System.out.println("birth day=" + birthday);
		System.out.println("today    =" + now);
		System.out.println(days + "days");
	}
}
