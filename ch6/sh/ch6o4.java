
public class ch6o4 {

  public static void main(String[] args) {
    Student1 s = new Student1();
    s.name = "ȫ�浿";
    s.ban = 1;
    s.no = 1;
    s.kor = 100;
    s.eng = 60;
    s.math = 76;
    System.out.println("�̸�:" + s.name);
    System.out.println("����:" + s.getTotal());
    System.out.println("���:" + s.getAverage());
  }
}


class Student1 {
  String name;
  int ban;
  int no;
  int kor;
  int eng;
  int math;

  public int getTotal() {
    return kor + eng + math;
  }

  public float getAverage() {
    return Math.round(getTotal() / 3f * 100) / 100f;
  }
}
