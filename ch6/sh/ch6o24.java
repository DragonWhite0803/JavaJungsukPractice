
public class ch6o24 {
  public static int abs(int value){
    value = value >= 0 ? value : -value;
    return value;
}
  public static void main(String[] args) {
    int value = 5;
    System.out.println(value+" �� ���밪:"+abs(value));
    value = -10;
    System.out.println(value+" �� ���밪:"+abs(value));
  }

}
