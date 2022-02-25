
public class Excercise4_4 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

		while (sum <= 100) {
			if (i % 2 == 0) {
				sum -= i;
			} else {
				sum += i;
			}
			i++;
		}
		System.out.println(i + "까지 더하면 총합은 " + sum + "으로 100 이상입니다.");
	}
}
