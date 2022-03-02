public class Exercise6_8 {
	int kind; // 인스턴스 변수
	int num; // 인스턴스 변수
	static int width; // 클래스 변수
	static int height; // 클래스 변수

	Exercise6_8(int kind, int num) { // 지역변수
		this.kind = kind;
		this.num = num;
	}

	public static void main(String args[]) {
		Exercise6_8 card = new Exercise6_8(1, 1); // 지역변수
	}
}
