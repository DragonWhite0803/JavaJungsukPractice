import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student4 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int total; // ����
	int schoolRank; // �������

	Student4(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		this.total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage()
				+ "," + schoolRank;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Student4) {
			Student4 tmp = (Student4) o;
			return tmp.total - this.total;
		}
		return -1;
	}
} // class Student4

class Exercise11_8 {
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // ���� list�� �������� ������������ �����Ѵ�
		int prevRank = -1; // ���� �������
		int prevTotal = -1; // ���� ����
		int length = list.size();

		for (int i = 0; i < length; i++) {
			Student4 tmp = (Student4) list.get(i);
			if (tmp.total == prevTotal) {
				tmp.schoolRank = prevRank;
			} else {
				tmp.schoolRank = i + 1; // ���������� ���������̹Ƿ� ������ �����ֱ⸸ �ϸ�ȴ�.
			}
			prevRank = tmp.schoolRank;
			prevTotal = tmp.total;
		}

	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student4("���ڹ�", 2, 1, 70, 90, 70));
		list.add(new Student4("���ڹ�", 2, 2, 60, 100, 80));
		list.add(new Student4("ȫ�浿", 1, 3, 100, 100, 100));
		list.add(new Student4("���ü�", 1, 1, 90, 70, 80));
		list.add(new Student4("���ڹ�", 1, 2, 80, 80, 90));

		calculateSchoolRank(list);

		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}