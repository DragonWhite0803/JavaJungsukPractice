
public class Excercise4_2 {
	public static void main(String[] args) {
		int sum = 0; // 변수 초기화
		for (int i = 1; i <= 20; i++) { // 1부터 20까지 반복
			if (!(i % 2 == 0 || i % 3 == 0)) {
				sum += i; // 조건문에 부합하면 sum값에 계속 더해나감
			}
		}
		System.out.println(sum);
	}
}
