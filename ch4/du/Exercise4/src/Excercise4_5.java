
public class Excercise4_5 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		while (i <= 10) {
			while (j <= i) { // j�� i���� �۰ų� ���� �������� �ݺ�
				System.out.print("*");
				j++;
			}
			System.out.println();
			j = 0; // ���� �ݺ��� ���� j�� 0���� �ʱ�ȭ
			i++;
		}
	} // end of main
}