public class Excercise4_3 {
	public static void main(String[] args) {
		int tot = 0; // 변수 초기화
		int sum = 0;

		for (int i = 1; i <= 10; i++) { // 10까지 반복
			for (int j = 1; j <= i; j++) { // n번째 sum은 1부터 i값까지 더한 값
				sum += j;
			}
			tot += sum; // tot에 n번째 sum값을 계속 더해나감
			sum = 0; // 다음 반복을 위해 sum값 0으로 초기화
		}
		System.out.println(tot);
	}
}
