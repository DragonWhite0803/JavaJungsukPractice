
public class Excercise4_9 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
			int c = str.charAt(i) - 48; // 0-9�� �����ڵ�� 48-57�̹Ƿ� ���� ���� �ޱ����� -48 ����
			sum += c;
		}
		System.out.println("sum="+sum);
	}
}
