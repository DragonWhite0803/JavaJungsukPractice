package Chapter3;

public class Exercise3_9 {
  public static void main(String[] args) {
    char ch = 'z';
    boolean b = ch>=65 && ch<=90 || ch>=97 && ch<=122 || ch>=48 && ch<=57;
    System.out.println(b);
    }
}
