
public class ch5o7 {

  public static void main(String[] args) {
    // . . ���ڿ��� ���ڷ� ��ȯ�Ѵ� �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�
    int money = 3100;
    System.out.println("money=" + money);
    int[] coinUnit = {500, 100, 50, 10}; // ������ ����
    int[] coin = {5, 5, 5, 5}; // ������ ������ ����
    for (int i = 0; i < coinUnit.length; i++) {
      int coinNum = 0;
      coinNum = money / coinUnit[i];
      if (coin[i] >= coinNum) {
        coin[i] -= coinNum;
      } else {
        coinNum = coin[i];
        coin[i] = 0;
      }
      money = money - coinUnit[i] * coinNum;
      System.out.println(coinUnit[i] + "��: " + coinNum);
    }
    if (money > 0) {
      System.out.println("�Ž������� �����մϴ�.");
      System.exit(0); // . ���α׷��� �����Ѵ�
    }
    System.out.println("=���� ������ ����=");
    for (int i = 0; i < coinUnit.length; i++) {
      System.out.println(coinUnit[i] + "��:" + coin[i]);
    }
  }

}
