import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise14_6 {
	public static void main(String[] args) {
		String[] strArr = { "aaa", "bb", "c", "dddd" };

		IntStream mStrm = Stream.of(strArr).mapToInt(String::length); // ���� ������ ����

		System.out.print("max=" + mStrm.max().getAsInt()); // max �޼ҵ�(Optional�� Int�� �ٲ㼭 ���)
	}
}
