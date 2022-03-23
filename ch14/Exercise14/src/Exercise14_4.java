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
				// map �Լ� ������ �� ���� �ξ���Ѵ�. Ư�� ���ٽİ� ����Ǵ� �κ� ������ ��.
				.filter(iArr -> iArr[0] + iArr[1] == 6)
				// iArr = {[1,1],[1,2].....,[6,5],[6,6]}
				.forEach(fArr -> System.out.println(Arrays.toString(fArr)));
		// ���������� ����ȴٴ� ���� ���� �����ϰ� ����ĵ� ������ �׷��� �ٲܰ�.
		// *�ʹ� �򰥸��ٸ� ��Ʈ���� �ɰ���*
	}
}
