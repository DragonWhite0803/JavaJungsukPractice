import java.util.ArrayList;
import java.util.Scanner;

class Exercise11_14 {
	static ArrayList record = new ArrayList(); // 성적데이터를 저장할 공간
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
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		} // while(true)
	}

// menu를 보여주는 메서드
	static int displayMenu() {
		System.out.println("**************************************************");
		System.out.println("*		  성적 관리 프로그램  		 *");
		System.out.println("**************************************************");
		System.out.println();
		System.out.println("1.학생성적 입력하기");
		System.out.println();
		System.out.println("2.학생성적 보기");
		System.out.println();
		System.out.println("3.프로그램 종료");
		System.out.println();
		System.out.print("(1~3)원하는 메뉴를 선택하세요: ");

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
				System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요.");
				System.out.print("(1~3)원하는 메뉴를 선택하세요: ");
				continue;
			}
		}
		return menu;
	} // public static int displayMenu(){
// 

	static void inputRecord() {
		System.out.println("1.학생성적 입력하기");
		System.out.println("'이름,반,번호,국어성적,영어성적,수학성적'의 순서로 공백없이 입력하세요.");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");

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

					System.out.println("잘입력되었습니다. 입력을 마치려면 q를 입력하세요.");
				} catch (Exception e) {
					System.out.println("입력오류입니다. '이름,반,번호,국어성적,영어성적,수학성적'의 순서로 입력하세요.");
				} finally {
					continue;
				}
			}
		} // end of while
	} // public static void inputRecord() {
// 데이터 목록을 보여주는 메서드

	static void displayRecord() {
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		int length = record.size();
		if (length > 0) {
			System.out.println();
			System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
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
			System.out.println("총점: " + koreanTotal + " " + englishTotal + " " + mathTotal + " " + total);
			System.out.println();
		} else {
			System.out.println("====================================================");
			System.out.println("데이터가 없습니다.");
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
	int classRank; // 반등수

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