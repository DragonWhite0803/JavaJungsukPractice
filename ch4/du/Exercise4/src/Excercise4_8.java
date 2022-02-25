public class Excercise4_8 {
	public static void main(String[] args) {
		for (int x=0; x<=10; x++) { //x의 범위만큼 반복
			for (int y=0; y<=10; y++) { //y의 범위만큼 반복
				if(2*x + 4*y == 10) { //식이 참일 때만 출력
					System.out.println("x="+x+", y="+y);
				}
			}
		}
	}
}
