import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student2 {
	String name;
	boolean isMale; // ����
	int hak; // �г�
	int ban; // ��
	int score;

	Student2(String name, boolean isMale, int hak, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}

	String getName() {
		return name;
	}

	boolean isMale() {
		return isMale;
	}

	int getHak() {
		return hak;
	}

	int getBan() {
		return ban;
	}

	int getScore() {
		return score;
	}

	public String toString() {
		return String.format("[%s, %s, %d�г� %d��, %3d��]", name, isMale ? "��" : "��", hak, ban, score);
	}

	enum Level {
		HIGH, MID, LOW
	}
}

class Exercise14_9 {
	public static void main(String[] args) {
		Student2[] stuArr = { new Student2("���ڹ�", true, 1, 1, 300), new Student2("������", false, 1, 1, 250),
				new Student2("���ڹ�", true, 1, 1, 200), new Student2("������", false, 1, 2, 150),
				new Student2("���ڹ�", true, 1, 2, 100), new Student2("������", false, 1, 2, 50),
				new Student2("Ȳ����", false, 1, 3, 100), new Student2("������", false, 1, 3, 150),
				new Student2("���ڹ�", true, 1, 3, 200), new Student2("���ڹ�", true, 2, 1, 300),
				new Student2("������", false, 2, 1, 250), new Student2("���ڹ�", true, 2, 1, 200),
				new Student2("������", false, 2, 2, 150), new Student2("���ڹ�", true, 2, 2, 100),
				new Student2("������", false, 2, 2, 50), new Student2("Ȳ����", false, 2, 3, 100),
				new Student2("������", false, 2, 3, 150), new Student2("���ڹ�", true, 2, 3, 200) };
		Map<Integer, Map<Integer, Long>> totalScoreByHakAndBan = Stream.of(stuArr)

				.collect(

						Collectors.groupingBy(Student2::getHak,

								Collectors.groupingBy(Student2::getBan,

										Collectors.summingLong(Student2::getScore))));
		// summingLong�� ���ٴ� ���� ��������.(Map�� �׷��� ������� ����)
		for (Object e : totalScoreByHakAndBan.entrySet()) {
			System.out.println(e);
		}
	} // main�� ��
}