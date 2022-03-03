class Outer {
    class Inner {
        int iv=100;
    }
}
public class ch7o25 {
    public static void main(String[] args) {
      Outer o = new Outer();
      Outer.Inner ii = o.new Inner();
      System.out.println(ii.iv);
    }
    //복습 할 내용
}
