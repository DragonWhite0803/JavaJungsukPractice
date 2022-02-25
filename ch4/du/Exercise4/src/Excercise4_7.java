
public class Excercise4_7 {
	public static void main(String[] args) {
		int random = (int) (Math.random() * 10); // 0~10까지 난수 발생 -> int형변환
		int value = random + 1 >= 6 ? random -3 : random + 1; // 6보다 크거나 같은 수는 -3을 해주고 아닐경우 0값을 배제하기 위해 +1해줌
		System.out.println("value:"+value);
		}
}
