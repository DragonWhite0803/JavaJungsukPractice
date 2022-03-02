
public class ch4o1 {
  public static void main(String[] args) {
    // 1
    int x = 11;
    if ((10 < x) && (x < 20)) {
      System.out.println("true1");
    }
    // 2
    char ch = 'x';
    // if((ch != '')||(ch !='\t')) {
    // System.out.println("true2");
    // }
    // 3
    if ((ch == 'x') || (ch == 'X')) {
      System.out.println("true3");
    }
    // 4
    if ('0' <= ch && ch <= '9') {
      System.out.println("true4");
    }
    // 5
    if ('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z') {
      System.out.println("true5");
    }
    // 6
    int year = 400;
    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
      System.out.println("true6");
    }
    // 7
    boolean powerOn = false;
    if (powerOn == false) {// or !powerOn
      System.out.println("true7");
    }
    // 8
    String str = "yes";
    if (str == "yes") {
      System.out.println("true8");
    }
  }
}
