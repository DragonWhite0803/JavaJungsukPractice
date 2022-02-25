
public class Excercise4_6 {
	public static void main(String[] args) {
		for (int firstdice = 1; firstdice <= 6; firstdice++) { // 첫번째 주사위의 숫자
			for (int seconddice = 1; seconddice <= 6; seconddice++) { // 두번째 주사위의 숫자
				if (firstdice + seconddice == 6) {
					System.out.println("(" + firstdice + "," + seconddice + ")"); // 합이 6일 때만 출력F
				}
			}
		}
	}
}
