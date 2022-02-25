public class Excercise4_15 {
	public static void main(String[] args){
		int number = 123454321;
		int tmp = number;
		int result =0; // number 변수 를 거꾸로 변환해서 담을 변수
		while(tmp !=0) {
			result += tmp%10;	//result 값에 tmp를 10으로 나눈 나머지 더하기
			tmp = (tmp - tmp%10)/10; //tmp에서 끝자리를 없애주는 작업
			result *=10;			//다음 반복시 다시 1의자리에 더하기 위해 10곱함
		}
		if(number == result/10)		//마지막 반복 시 불필요하게 10이 곱해지므로 result/10을 해줌
			System.out.println( number + "는 회문수 입니다."); 
		else
			System.out.println( number + "는 회문수가 아닙니다."); 
	} // main
}
