import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student2 {
	String name;
	boolean isMale; // 성별
	int hak; // 학년
	int ban; // 반
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
		return String.format("[%s, %s, %d학년 %d반, %3d점]", name, isMale ? "남" : "여", hak, ban, score);
	}

	enum Level {
		HIGH, MID, LOW
	}
}

class Exercise14_9 {
	public static void main(String[] args) {
		Student2[] stuArr = { new Student2("나자바", true, 1, 1, 300), new Student2("김지미", false, 1, 1, 250),
				new Student2("김자바", true, 1, 1, 200), new Student2("이지미", false, 1, 2, 150),
				new Student2("남자바", true, 1, 2, 100), new Student2("안지미", false, 1, 2, 50),
				new Student2("황지미", false, 1, 3, 100), new Student2("강지미", false, 1, 3, 150),
				new Student2("이자바", true, 1, 3, 200), new Student2("나자바", true, 2, 1, 300),
				new Student2("김지미", false, 2, 1, 250), new Student2("김자바", true, 2, 1, 200),
				new Student2("이지미", false, 2, 2, 150), new Student2("남자바", true, 2, 2, 100),
				new Student2("안지미", false, 2, 2, 50), new Student2("황지미", false, 2, 3, 100),
				new Student2("강지미", false, 2, 3, 150), new Student2("이자바", true, 2, 3, 200) };
		Map<Integer, Map<Integer, Long>> totalScoreByHakAndBan = Stream.of(stuArr)

				.collect(

						Collectors.groupingBy(Student2::getHak,

								Collectors.groupingBy(Student2::getBan,

										Collectors.summingLong(Student2::getScore))));
		// summingLong을 쓴다는 것을 주의하자.(Map을 그렇게 만들었기 때문)
		for (Object e : totalScoreByHakAndBan.entrySet()) {
			System.out.println(e);
		}
	} // main의 끝
}