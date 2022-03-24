import java.util.stream.IntStream;

public class Exercise14_7 {
	public static void main(String[] args) {
//		List<Integer> iArr = new ArrayList<>();
//		for (int i = 0; i < 6; i++) {
//			int random = (int) (Math.random() * 45) + 1;
//			iArr.add(random);
//		}
//		System.out.println(iArr);

		IntStream ranNst = IntStream.rangeClosed(1, 50)
				// 1~50������ ���ڸ� �ٷ�� ��Ʈ�� ����
				.map(i -> (int) (Math.random() * 45) + 1)
				// �� ���ڵ��� (1~45)�� ���� ������ ��ȯ
				.distinct().limit(6)
				// �ߺ������� -> ���� 6���� ���� (�ߺ��Ǿ� ������ ���� �ſ� ���ƾ� ��ɻ�� -> �׷� �� ����)
				.sorted();
		// ����
		ranNst.forEach(System.out::println);
	}

	// �ƽ��� ��: ��� �ߺ��� ���� �������� �ߺ����� 45���̻� ���;� distinct�������� �ʹ� ���� �����ϰ� �Ǿ�
	// 45^45���� 1�� Ȯ���� ������ 6���� ���ڸ� ���� ���ϰԵȴ�. ��ǻ� �׷����� ��������!
	// �׷����� �߻�Ȯ���� ���ߴ� ����� �������̶�� �� ���� ��� �ƽ����� ���´�.
}
