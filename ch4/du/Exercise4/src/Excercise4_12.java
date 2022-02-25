public class Excercise4_12 {
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) { // 단순 반복문이지만 2-4단,5-7단,8-9단으로
			for (int j = 2; j < 5; j++) { // 쪼개서 출력하기 위해서 반복문 여러번 사용
				System.out.print(j + "*" + i + "=" + i * j + "\t\t");
			}
			System.out.println("\n");
		}
		System.out.println("\n");

		for (int i = 1; i < 4; i++) { // 5-7단
			for (int j = 5; j < 8; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t\t");
			}
			System.out.println("\n");
		}
		System.out.println("\n");

		for (int i = 1; i < 4; i++) { // 8-9단
			for (int j = 8; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t\t");
			}
			System.out.println("\n");
		}
	}
}
