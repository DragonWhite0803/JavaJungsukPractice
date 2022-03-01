
public class Exercise5_3 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) { // arr의 길이만큼 반복
			sum += arr[i]; // arr[i]번째 계속 더해나감
		}
		System.out.println("sum=" + sum);
	}
}
