package Chapter3;

public class Exercise3_1 {
  public static void main(String[] args) {
    int x = 2;
    int y = 5;
    char c = 'A'; // 'A' 65 �� �����ڵ��
    System.out.println(1 + x << 33); // int�� 32��Ʈ�̱� ������ �Ѿ�� �ٽ� ������ x+1->11 ->33��Ʈ ����Ʈ ->110=6
    System.out.println(y >= 5 || x < 0 && x > 2); //y�� >=5 �ų� x<0,x>2�� ���ÿ� �����Ұ�� true (y>=5�̹Ƿ� true)
    System.out.println(y += 10 - x++); //y=y+10 -> 15-2=13 (x++�� ���߿� ����� x = 3)
    System.out.println(x+=2); // x=x+2 (x=3�̹Ƿ� 5)
    System.out.println( !('A' <= c && c <='Z') ); //�Ѵ� �������� ������ true ->A<=c true, c<=Z true ���� false
    System.out.println('C'-c); //'C' = 67 -> 67-65=2
    System.out.println('5'-'0'); // �����ڵ峢���� ���� -> 53-58 = 5
    System.out.println(c+1); //65+1 = 66
    System.out.println(++c); // 65+1 = 66->B
    System.out.println(c++); // +1�켱������ ������ ���� B
    System.out.println(c); //������ �������� �Ͼ C
    }

}
