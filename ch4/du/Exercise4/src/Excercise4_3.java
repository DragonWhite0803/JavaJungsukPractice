public class Excercise4_3 {
	public static void main(String[] args) {
		int tot = 0; // ���� �ʱ�ȭ
		int sum = 0;

		for (int i = 1; i <= 10; i++) { // 10���� �ݺ�
			for (int j = 1; j <= i; j++) { // n��° sum�� 1���� i������ ���� ��
				sum += j;
			}
			tot += sum; // tot�� n��° sum���� ��� ���س���
			sum = 0; // ���� �ݺ��� ���� sum�� 0���� �ʱ�ȭ
		}
		System.out.println(tot);
	}
}
