import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student5 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank; // �������
	int classRank; // �ݵ��

	Student5(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public int compareTo(Object o) {
		if (o instanceof Student5) {
			Student5 tmp = (Student5) o;
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage()
				+ "," + schoolRank + "," + classRank // �����߰�
		;
	}
} // class Student5

class ClassTotalComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Student5 && o2 instanceof Student5) {
			Student5 s1 = (Student5) o1;
			Student5 s2 = (Student5) o2;
			if (s1.ban == s2.ban) {
				return s2.total - s1.total; // �������� ����
			}
			return s1.ban - s2.ban;
		}
		return -1;
	}
}

class Exercise11_9 {
	public static void calculateClassRank(List list) {
// ���� �ݺ� �������� ������������ �����Ѵ�
		Collections.sort(list, new ClassTotalComparator());
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();

		for (int i = 0, n = 0; i < length; i++, n++) {
			Student5 tmp = (Student5) list.get(i);
			if (tmp.ban != prevBan) {
				prevRank = -1;
				prevTotal = -1;
				n = 0;
			}
			if (tmp.total == prevTotal) {
				prevRank = tmp.classRank;
			} else {
				tmp.classRank = n + 1;
				prevBan = tmp.ban;
				prevTotal = tmp.total;
				prevRank = tmp.classRank;
			}
		}
	} // public static void calculateClassRank(List list) {

	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // ���� list�� �������� ������������ �����Ѵ�
		int prevRank = -1; // ���� �������
		int prevTotal = -1; // ���� ����
		int length = list.size();

		for (int i = 0; i < length; i++) {
			Student5 tmp = (Student5) list.get(i);
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
		list.add(new Student5("���ڹ�", 2, 1, 70, 90, 70));
		list.add(new Student5("���ڹ�", 2, 2, 60, 100, 80));
		list.add(new Student5("ȫ�浿", 1, 3, 100, 100, 100));
		list.add(new Student5("���ü�", 1, 1, 90, 70, 80));
		list.add(new Student5("���ڹ�", 1, 2, 80, 80, 90));
		calculateSchoolRank(list);
		calculateClassRank(list);
		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}