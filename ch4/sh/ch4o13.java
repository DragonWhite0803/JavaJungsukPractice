
public class ch4o13 {

  public static void main(String[] args) {
    String value = "12o34";
    char ch = ' ';
    boolean isNumber = true;
    // charAt(int i) �ݺ����� �� �̿��ؼ� ���ڿ��� ���ڸ�
    // . �ϳ��� �о �˻��Ѵ�
    for(int i=0; i < value.length() ;i++) {
      if (!(value.charAt(i) >= '0' && value.charAt(i) <= '9')) {
        isNumber = false;
        break;
    }
    }
    if (isNumber) {
    System.out.println(value+"�� �����Դϴ�."); 
    } else {
    System.out.println(value+"�� ���ڰ� �ƴմϴ�.");
    }

  }

}
