import java.util.Scanner;

public class ch4o14 {

  public static void main(String[] args) {
    // 1~100 answer . ������ ������ ���� �� �� �����Ѵ�
    int answer = (int) (Math.random() * 100) + 1;
    int input = 0; // ������Է��� ������ ����
    int count = 0; // �õ�Ƚ���� �������� ����
    // Scanner ȭ������ ���� ������Է��� �ޱ� ���ؼ� Ŭ���� ���
    Scanner sc = new Scanner(System.in);
    do {
      count++;
      System.out.print("1�� 100 ������ ���� �Է��ϼ���:");
      input = sc.nextInt(); // input . �Է¹��� ���� ���� input�� �����Ѵ�

      if (answer == input) {
        System.out.println("������ϴ�.");
        System.out.println("�õ�Ƚ���� " + count + "���Դϴ�.");
        break;
      } else if (answer > input) {
        System.out.println("�� ū ���� �Է��ϼ���.");
      } else {
        System.out.println("�� ���� ���� �Է��ϼ���.");
      }
    } while (true); // ���ѹݺ���
  }
}
