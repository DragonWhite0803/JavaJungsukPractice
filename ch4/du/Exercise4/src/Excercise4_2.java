
public class Excercise4_2 {
	public static void main(String[] args) {
		int sum = 0; // ���� �ʱ�ȭ
		for (int i = 1; i <= 20; i++) { // 1���� 20���� �ݺ�
			if (!(i % 2 == 0 || i % 3 == 0)) {
				sum += i; // ���ǹ��� �����ϸ� sum���� ��� ���س���
			}
		}
		System.out.println(sum);
	}
}
