
public class Exercise9_12 {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(-78, 50) + ",");
		}
	}

	public static int getRand(int start, int end) {
		int count = Math.abs(start - end); // 0 ~ count 까지 범위지정 (count 포함)
		int random = (int) (Math.random() * 10000) % (count + 1); // 0 ~ count 까지의 난수 발생
																	// 충분히 큰 수도 범위가 될 수 있게 10000곱함
		return random + Math.min(start, end); // 주어진 범위의 작은 값을 더해주어서 start~end사이의 난수 return
	}
}
