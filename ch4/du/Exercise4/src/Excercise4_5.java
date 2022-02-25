
public class Excercise4_5 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		while (i <= 10) {
			while (j <= i) { // j가 i보다 작거나 같을 때까지만 반복
				System.out.print("*");
				j++;
			}
			System.out.println();
			j = 0; // 다음 반복을 위해 j값 0으로 초기화
			i++;
		}
	} // end of main
}