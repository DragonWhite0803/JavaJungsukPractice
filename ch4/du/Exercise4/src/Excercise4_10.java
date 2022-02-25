public class Excercise4_10 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		int numlen = (int) (Math.log10(num)); // Math.log로 숫자의 자릿수 구하기
		for (int i = 0; i <= numlen; i++) { // 자릿수만큼 반복
			int tenmul = (int) (Math.pow(10, i)); // 10의 i제곱값 정의
			int n = num / tenmul % 10; // num을 tenmul로 나눈값을 10으로 다시 나눈 나머지 = 해당 자릿수의 값
			sum += n;
		}
		System.out.println(sum);
	}
}
