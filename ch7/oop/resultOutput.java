
public class resultOutput {
  public void resultPrint(String movielist, int inputdate) {
    System.out.println("입장완료");
    if(movielist.contains("~")) {
      System.out.println("입장날짜 : " + inputdate);
      
    }else {
      System.out.println("입장날짜 : " + inputdate + "선착순 1명");
      
    }
    
  }
}
