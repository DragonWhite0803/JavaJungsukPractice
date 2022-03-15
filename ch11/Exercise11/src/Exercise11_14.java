import java.util.ArrayList;
import java.util.Scanner;

class Exercise11_14 {
	static ArrayList record = new ArrayList(); // ���������͸� ������ ����
	static Scanner s = new Scanner(System.in);

	public static void main(String args[]) {
		while (true) {
			switch (displayMenu()) {
			case 1:
				inputRecord();
				break;
			case 2:
				displayRecord();
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
		} // while(true)
	}

// menu�� �����ִ� �޼���
	static int displayMenu() {
		System.out.println("**************************************************");
		System.out.println("*		  ���� ���� ���α׷�  		 *");
		System.out.println("**************************************************");
		System.out.println();
		System.out.println("1.�л����� �Է��ϱ�");
		System.out.println();
		System.out.println("2.�л����� ����");
		System.out.println();
		System.out.println("3.���α׷� ����");
		System.out.println();
		System.out.print("(1~3)���ϴ� �޴��� �����ϼ���: ");

		int menu = 0;

		while (true) {
			String command = s.nextLine();
			if (command.equals("1")) {
				menu = 1;
				break;
			} else if (command.equals("2")) {
				menu = 2;
				break;
			} else if (command.equals("3")) {
				menu = 3;
				break;
			} else {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				System.out.print("(1~3)���ϴ� �޴��� �����ϼ���: ");
				continue;
			}
		}
		return menu;
	} // public static int displayMenu(){
// 

	static void inputRecord() {
		System.out.println("1.�л����� �Է��ϱ�");
		System.out.println("'�̸�,��,��ȣ,�����,�����,���м���'�� ������ ������� �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�.");

		while (true) {
			System.out.print(">>");
			String data = s.nextLine();
			if (data.equals("q") || data.equals("Q")) {
				break;
			} else {
				String[] datas = data.split(",", 6);

				try {
					int ban = Integer.parseInt(datas[1]);
					int no = Integer.parseInt(datas[2]);
					int kor = Integer.parseInt(datas[3]);
					int eng = Integer.parseInt(datas[4]);
					int math = Integer.parseInt(datas[5]);

					StudentF stu = new StudentF(datas[0], ban, no, kor, eng, math);
					record.add(stu);

					System.out.println("���ԷµǾ����ϴ�. �Է��� ��ġ���� q�� �Է��ϼ���.");
				} catch (Exception e) {
					System.out.println("�Է¿����Դϴ�. '�̸�,��,��ȣ,�����,�����,���м���'�� ������ �Է��ϼ���.");
				} finally {
					continue;
				}
			}
		} // end of while
	} // public static void inputRecord() {
// ������ ����� �����ִ� �޼���

	static void displayRecord() {
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		int length = record.size();
		if (length > 0) {
			System.out.println();
			System.out.println("�̸� �� ��ȣ ���� ���� ���� ���� ��� ������� �ݵ��");
			System.out.println("====================================================");
			for (int i = 0; i < length; i++) {
				StudentF StudentF = (StudentF) record.get(i);
				System.out.println(StudentF);
				koreanTotal += StudentF.kor;
				mathTotal += StudentF.math;
				englishTotal += StudentF.eng;
				total += StudentF.total;
			}
			System.out.println("====================================================");
			System.out.println("����: " + koreanTotal + " " + englishTotal + " " + mathTotal + " " + total);
			System.out.println();
		} else {
			System.out.println("====================================================");
			System.out.println("�����Ͱ� �����ϴ�.");
			System.out.println("====================================================");
		}
	} // static void displayRecord() {
}

class StudentF implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank;
	int classRank; // �ݵ��

	StudentF(String name, int ban, int no, int kor, int eng, int math) {
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
		if (o instanceof StudentF) {
			StudentF tmp = (StudentF) o;
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage()
				+ "," + schoolRank + "," + classRank;
	}
}
// class StudentF