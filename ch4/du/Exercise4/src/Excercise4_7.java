
public class Excercise4_7 {
	public static void main(String[] args) {
		int random = (int) (Math.random() * 10); // 0~10���� ���� �߻� -> int����ȯ
		int value = random + 1 >= 6 ? random -3 : random + 1; // 6���� ũ�ų� ���� ���� -3�� ���ְ� �ƴҰ�� 0���� �����ϱ� ���� +1����
		System.out.println("value:"+value);
		}
}
