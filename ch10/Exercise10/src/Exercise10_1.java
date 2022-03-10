import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Exercise10_1 {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.of(2010, 1, 1);

		for (int i = 1; i <= 12; i++) {
			date = date.withMonth(i); // i ������ �� ����
			LocalDate scSun = date.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
			System.out.println(scSun.format(dtf) + "�� 2��° �Ͽ����Դϴ�");
			//

//			date = date.withDayOfMonth(1); // �Ŵ� 1�Ϸ� �ʱ�ȭ
//			DayOfWeek dow = date.getDayOfWeek(); // 1���� ������������
//			int pv = 7 - dow.getValue(); // �Ͽ����� �Ǳ� ���� ������� �ϴ� ��
//			if (dow.getValue() == 7) { // 1���� �Ͽ����ϰ��
//				System.out.println((date.plusWeeks(1)).format(dtf) + "�� 2��° �Ͽ����Դϴ�"); // �ָ� +1
//			} else {
//				System.out.println((date.plusDays(pv)).plusWeeks(1).format(dtf) + "�� 2��° �Ͽ����Դϴ�");
//				// �Ͽ��Ϸ� ����� �� +1
//			}

		}
	}
}

//DayOfWeekInMonth �޼��带 ������� �ʾ��� ����� ������ �ּ�ó�� �Ͽ���