import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise14_5 {
	public static void main(String[] args) {
		String[] strArr = { "aaa", "bb", "c", "dddd" };

//		Stream<String> sStrm = Stream.of(strArr); // �迭�� ���(���ڿ�)�� �޴� ��Ʈ�� ����
//		IntStream mStrm = sStrm.mapToInt(i -> i.length()); // sStrm�� �� ����� ���̸� �޴� IntStream

		IntStream mStrm = Stream.of(strArr).mapToInt(String::length); // ���� (�̰� �����ؾ���)

		System.out.print("sum=" + mStrm.sum()); // IntStream�� sum();�޼ҵ带 ������ ����
	}
}
