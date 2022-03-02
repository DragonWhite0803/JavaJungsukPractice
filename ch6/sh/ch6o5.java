
public class ch6o5 {

  public static void main(String[] args) {
    Student3 s = new Student3("ȫ�浿", 1, 1, 100, 60, 76);
    System.out.println(s.info());
  }
}


class Student3 {
  String name;
  int ban;
  int no;
  int kor;
  int eng;
  int math;

  public Student3(String name, int ban, int no, int kor, int eng, int math) {
    super();
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;

  }

  int getTotal() {
    return kor + eng + math;
  }

  float getAverage() {
    float tmp = (float) getTotal() / 3;
    return (Math.round(tmp * 10f)) / 10f;
  }

  public String info() {
    return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + ","
        + getAverage();
  }
}
