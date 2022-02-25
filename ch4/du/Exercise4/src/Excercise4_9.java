
public class Excercise4_9 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
			int c = str.charAt(i) - 48; // 0-9는 문자코드로 48-57이므로 본래 값을 받기위해 -48 해줌
			sum += c;
		}
		System.out.println("sum="+sum);
	}
}
