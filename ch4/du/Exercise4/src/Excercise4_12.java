public class Excercise4_12 {
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) { // �ܼ� �ݺ��������� 2-4��,5-7��,8-9������
			for (int j = 2; j < 5; j++) { // �ɰ��� ����ϱ� ���ؼ� �ݺ��� ������ ���
				System.out.print(j + "*" + i + "=" + i * j + "\t\t");
			}
			System.out.println("\n");
		}
		System.out.println("\n");

		for (int i = 1; i < 4; i++) { // 5-7��
			for (int j = 5; j < 8; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t\t");
			}
			System.out.println("\n");
		}
		System.out.println("\n");

		for (int i = 1; i < 4; i++) { // 8-9��
			for (int j = 8; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t\t");
			}
			System.out.println("\n");
		}
	}
}
