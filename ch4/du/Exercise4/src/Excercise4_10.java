public class Excercise4_10 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		int numlen = (int) (Math.log10(num)); // Math.log�� ������ �ڸ��� ���ϱ�
		for (int i = 0; i <= numlen; i++) { // �ڸ�����ŭ �ݺ�
			int tenmul = (int) (Math.pow(10, i)); // 10�� i������ ����
			int n = num / tenmul % 10; // num�� tenmul�� �������� 10���� �ٽ� ���� ������ = �ش� �ڸ����� ��
			sum += n;
		}
		System.out.println(sum);
	}
}
