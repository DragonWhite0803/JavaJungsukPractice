
public class ch6o18 {
//  class MemberCall {
//
//    int iv = 10;
//    static int cv = 20;
//    int iv2 = cv;
//    static int cv2 = iv; // 라인 A
//
//    static void staticMethod1() {
//        System.out.println(cv);
//        System.out.println(iv); // 라인 B
//    }
//
//    void instanceMethod1() { 
//        System.out.println(cv); 
//        System.out.println(iv);  //라인 C 
//    } 
//
//    static void staticMethod2() { 
//        staticMethod1(); 
//        instanceMethod1();  //라인 D 
//    } 
//
//    void instanceMethod2() { 
//        staticMethod1();  //라인 E 
//        instanceMethod1(); 
//    } 
//
//}
  
  //답은 A,B,D 라인이다.
  //설명:A라인은 static 변수 초기화에 인스턴스 변수를 사용 할 수 없어서 이다
  //B라인은 static 메서드엔 인스턴스 변수를 사용할 수 없기 때문이다.
  //C라인은 static 메서드엔 인스턴스 메서드를 사용할 수 없기 때문이다.
}
