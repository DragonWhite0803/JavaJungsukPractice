
public class resultOutput {
  public void resultPrint(String movielist, int inputdate) {
    System.out.println("����Ϸ�");
    if(movielist.contains("~")) {
      System.out.println("���峯¥ : " + inputdate);
      
    }else {
      System.out.println("���峯¥ : " + inputdate + "������ 1��");
      
    }
    
  }
}
