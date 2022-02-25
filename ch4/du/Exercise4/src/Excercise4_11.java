public class Excercise4_11 {
	public static void main(String[] args) {
		// Fibonnaci수열의 시작의 첫 두 숫자를 1, 1로 한다
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		System.out.print(num1+","+num2); //처음 두 수는 미리 출력
		for (int i = 0 ; i < 8 ; i++ ) { //10번째 수를 출력 하려면 8번 추가로 반복
			num3 = num1+num2;			//i번째 수열은 i-2번째 값과 i-1번째 값의 합
			num1=num2;					//연산이 끝났으므로 다음 연산의 i-2값은 현재 연산의 i-1값이 됨
			num2=num3;					//연산이 끝났으므로 다음 연산의 i-1값은 현재 연산의 i값이 됨
			System.out.print(","+num3);
		}
	} // end of main
}
