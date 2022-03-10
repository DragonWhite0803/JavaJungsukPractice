import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Exercise10_2 {
	static int paycheckCount(LocalDate from, LocalDate to) {
		int counter = 0;

		long days = from.until(to, ChronoUnit.DAYS); // from ~ to ���̿� ������ �ִ��� ���
		for (int i = 0; i <= days; i++) { // ��¥ ����ŭ �ݺ� ����, ������ �� ���� ����
			if (from.getDayOfMonth() == 21) { // 21�� ��� ī��Ʈ
				counter++;
			}
			from = from.plusDays(1); // 1�� ����
		}
		return counter;
	}

	static void printResult(LocalDate from, LocalDate to) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		System.out.print(from.format(dtf) + " ~ " + to.format(dtf) + ":");
		System.out.println(paycheckCount(from, to));
	}

	public static void main(String[] args) {
		LocalDate fromCal;
		LocalDate toCal;

		fromCal = LocalDate.of(2010, 1, 1);
		toCal = LocalDate.of(2010, 1, 1);
		printResult(fromCal, toCal);

		fromCal = LocalDate.of(2010, 1, 21);
		toCal = LocalDate.of(2010, 1, 21);
		printResult(fromCal, toCal);

		fromCal = LocalDate.of(2010, 1, 1);
		toCal = LocalDate.of(2010, 3, 1);
		printResult(fromCal, toCal);

		fromCal = LocalDate.of(2010, 1, 1);
		toCal = LocalDate.of(2010, 3, 23);
		printResult(fromCal, toCal);

		fromCal = LocalDate.of(2010, 1, 23);
		toCal = LocalDate.of(2010, 3, 21);
		printResult(fromCal, toCal);

		fromCal = LocalDate.of(2011, 1, 22);
		toCal = LocalDate.of(2010, 3, 21);
		printResult(fromCal, toCal);

	}
}
