public class ch9o8 {
  public static double round(double d, int n){
    double num = Math.pow(10.0, (double)n);
    return Math.round(d*num)/num;
}
  
  public static void main(String[] args) {
    System.out.println(round(3.1415, 1));
    System.out.println(round(3.1415, 2));
    System.out.println(round(3.1415, 3));
    System.out.println(round(3.1415, 4));
    System.out.println(round(3.1415, 5));
  }
}
