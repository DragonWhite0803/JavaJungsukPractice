import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise14_6 {
	public static void main(String[] args) {
		String[] strArr = { "aaa", "bb", "c", "dddd" };

		IntStream mStrm = Stream.of(strArr).mapToInt(String::length); // 전의 예제와 같음

		System.out.print("max=" + mStrm.max().getAsInt()); // max 메소드(Optional을 Int로 바꿔서 출력)
	}
}
