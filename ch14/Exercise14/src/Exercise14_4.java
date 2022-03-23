import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise14_4 {
	public static void main(String[] args) {
//		for (int i = 1; i < 7; i++) {
//			for (int j = 1; j < 7; j++) {
//				if (i + j == 6) {
//					System.out.println("[" + i + "," + j + "]");
//				}
//			}
//		}

		Stream<Integer> die = IntStream.rangeClosed(1, 6).boxed();

		die.flatMap(i -> Stream.of(1, 2, 3, 4, 5, 6).map(i2 -> new int[] { i, i2 }))
				// map 함수 사용법을 잘 익혀 두어야한다. 특히 람다식과 연계되는 부분 유의할 것.
				.filter(iArr -> iArr[0] + iArr[1] == 6)
				// iArr = {[1,1],[1,2].....,[6,5],[6,6]}
				.forEach(fArr -> System.out.println(Arrays.toString(fArr)));
		// 순차적으로 실행된다는 것을 꼭꼭 이해하고 사고방식도 앞으론 그렇게 바꿀것.
		// *너무 헷갈린다면 스트림을 쪼개자*
	}
}
