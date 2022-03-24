import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise14_5 {
	public static void main(String[] args) {
		String[] strArr = { "aaa", "bb", "c", "dddd" };

//		Stream<String> sStrm = Stream.of(strArr); // 배열의 요소(문자열)를 받는 스트림 생성
//		IntStream mStrm = sStrm.mapToInt(i -> i.length()); // sStrm의 각 요소의 길이를 받는 IntStream

		IntStream mStrm = Stream.of(strArr).mapToInt(String::length); // 단축 (이걸 연습해야함)

		System.out.print("sum=" + mStrm.sum()); // IntStream은 sum();메소드를 가지고 있음
	}
}
