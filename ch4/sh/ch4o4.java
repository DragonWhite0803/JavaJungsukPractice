
public class ch4o4 {

  public static void main(String[] args) {
    int sum = 1;
    int i = 2;
    while (sum < 100) {
      if (i % 2 == 0) {
        i = i*-1;
      }
      sum += i;
      if(i<0) {
        i = i*-1;
      }
      i++;
    }
    System.out.println(i+"¹ø");
  }
}
