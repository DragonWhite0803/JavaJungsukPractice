
public class Excercise4_6 {
	public static void main(String[] args) {
		for (int firstdice = 1; firstdice <= 6; firstdice++) { // ù��° �ֻ����� ����
			for (int seconddice = 1; seconddice <= 6; seconddice++) { // �ι�° �ֻ����� ����
				if (firstdice + seconddice == 6) {
					System.out.println("(" + firstdice + "," + seconddice + ")"); // ���� 6�� ���� ���F
				}
			}
		}
	}
}
