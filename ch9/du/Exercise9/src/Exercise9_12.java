
public class Exercise9_12 {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(-78, 50) + ",");
		}
	}

	public static int getRand(int start, int end) {
		int count = Math.abs(start - end); // 0 ~ count ���� �������� (count ����)
		int random = (int) (Math.random() * 10000) % (count + 1); // 0 ~ count ������ ���� �߻�
																	// ����� ū ���� ������ �� �� �ְ� 10000����
		return random + Math.min(start, end); // �־��� ������ ���� ���� �����־ start~end������ ���� return
	}
}
