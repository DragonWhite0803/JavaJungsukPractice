public class Excercise4_11 {
	public static void main(String[] args) {
		// Fibonnaci������ ������ ù �� ���ڸ� 1, 1�� �Ѵ�
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // ����° ��
		System.out.print(num1+","+num2); //ó�� �� ���� �̸� ���
		for (int i = 0 ; i < 8 ; i++ ) { //10��° ���� ��� �Ϸ��� 8�� �߰��� �ݺ�
			num3 = num1+num2;			//i��° ������ i-2��° ���� i-1��° ���� ��
			num1=num2;					//������ �������Ƿ� ���� ������ i-2���� ���� ������ i-1���� ��
			num2=num3;					//������ �������Ƿ� ���� ������ i-1���� ���� ������ i���� ��
			System.out.print(","+num3);
		}
	} // end of main
}
