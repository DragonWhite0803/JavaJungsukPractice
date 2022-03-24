import java.util.stream.IntStream;

public class Exercise14_7 {
	public static void main(String[] args) {
//		List<Integer> iArr = new ArrayList<>();
//		for (int i = 0; i < 6; i++) {
//			int random = (int) (Math.random() * 45) + 1;
//			iArr.add(random);
//		}
//		System.out.println(iArr);

		IntStream ranNst = IntStream.rangeClosed(1, 50)
				// 1~50까지의 숫자를 다루는 스트림 생성
				.map(i -> (int) (Math.random() * 45) + 1)
				// 각 숫자들을 (1~45)의 랜덤 값으로 변환
				.distinct().limit(6)
				// 중복값제거 -> 개수 6개로 제한 (중복되어 삭제된 값이 매우 많아야 기능상실 -> 그럴 일 없음)
				.sorted();
		// 정렬
		ranNst.forEach(System.out::println);
	}

	// 아쉬운 점: 사실 중복값 제거 과정에서 중복값이 45개이상 나와야 distinct과정에서 너무 많이 삭제하게 되어
	// 45^45분의 1의 확률로 온전히 6개의 숫자를 받지 못하게된다. 사실상 그럴일이 없겠지만!
	// 그렇지만 발생확률을 낮추는 방식은 절대적이라고 할 수는 없어서 아쉬움이 남는다.
}
