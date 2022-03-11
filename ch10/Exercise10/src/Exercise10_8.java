import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

public class Exercise10_8 {
	public static void main(String[] args) {
		ZonedDateTime seoul = ZonedDateTime.now();
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime newyork = ZonedDateTime.now().withZoneSameInstant(nyId);

		int krOffset_SEC = seoul.getOffset().get(ChronoField.OFFSET_SECONDS);
		int nyOffset_SEC = newyork.getOffset().get(ChronoField.OFFSET_SECONDS);
		int diff = Math.abs(krOffset_SEC - nyOffset_SEC) / 3600; // 빼는 순서가 달라도 성립하게 절댓값

		System.out.println(seoul);
		System.out.println(newyork);
		System.out.println("sec1=" + krOffset_SEC);
		System.out.println("sec2=" + nyOffset_SEC);
		System.out.println("diff=" + diff + " hrs");

	}
}
