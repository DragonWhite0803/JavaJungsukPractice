import java.util.Scanner;

public class inputLine {
  private int inputNum;
  private int inputDate;
  
  dateTrueCheck datechk = new dateTrueCheck();
  movieList ml = new movieList();
  
  public void inputMovieNumDate() {
    Scanner sc = new Scanner(System.in);
    inputNum = sc.nextInt();
    if (inputNum == 1) { // 해당 if문은 데이터를 HashMap 사용으로 키값을 줘 쉽게 구분 할 수도 있다.
      System.out.println(ml.getInterstellar(0));
    } else if (inputNum == 2) {
      System.out.println(ml.getTenet(0));
    } else if (inputNum == 3) {
      System.out.println(ml.getInception(0));
    } else if (inputNum == 4) {
      System.out.println(ml.getInfinityTrain(0));
    } else if (inputNum == 5) {
      System.out.println(ml.getShawshank(0));
    }else {
      System.out.println("영화숫자 번호에 맞게 다시 입력하러 오세용");
      System.exit(0);
    }
    System.out.println("2.입장날짜를 입력하시오 (ex 20220214)");
    inputDate = sc.nextInt();
    sc.close();
  }
  
  public void amount(int inputNum) {
    if(Integer.parseInt(ml.getInterstellar(4)) == inputNum) {    
      getResult(ml.getInterstellar(1),ml.getInterstellar(2),ml.getInterstellar(3));
      
    }else if(Integer.parseInt(ml.getTenet(4)) == inputNum) {  
      getResult(ml.getTenet(1),ml.getTenet(2),ml.getTenet(3));
      
    }else if(Integer.parseInt(ml.getInception(4)) == inputNum) {
      getResult(ml.getInception(1),ml.getInception(2),ml.getInception(3));
      
    }else if(Integer.parseInt(ml.getInfinityTrain(4)) == inputNum) {
      getResult(ml.getInfinityTrain(1),ml.getInfinityTrain(2),ml.getInfinityTrain(3));
      
    }else if(Integer.parseInt(ml.getShawshank(4)) == inputNum) {
      getResult(ml.getShawshank(1),ml.getShawshank(2),ml.getShawshank(3));
    }
  }
  
  public void getResult(String movieL1, String movieL2, String movieL3) {
    if(datechk.dateTrue(movieL2,inputDate)==true) {
      if(Double.parseDouble(movieL3) > 1 ) {
        int amount = Integer.parseInt(movieL1);
        int sale = Integer.parseInt(movieL3);
        System.out.println("3.결과출력\n");
        System.out.println("입장완료");
        System.out.println("입장날짜: " + inputDate);
        System.out.println("금액:" + (int)(amount - sale) + "원");
      }else {
        double amount = Double.parseDouble(movieL1);
        double sale = Double.parseDouble(movieL3);
        System.out.println("3.결과출력\n");
        System.out.println("입장완료");
        System.out.println("입장날짜: " + inputDate);
        System.out.println("금액:" + (int)(amount - amount * sale) + "원");
      }
    }else {
      if(Double.parseDouble(movieL3) > 1 ) {
        int amount = Integer.parseInt(movieL1);
        int sale = Integer.parseInt(movieL3);
        System.out.println("3.결과출력\n");
        System.out.println("입장완료");
        System.out.println("입장날짜: " + inputDate + ", 선착순 1명");
        System.out.println("금액:" + (int)(amount - sale) + "원");
      }else {
        double amount = Double.parseDouble(movieL1);
        double sale = Double.parseDouble(movieL3);
        System.out.println("3.결과출력\n");
        System.out.println("입장완료");
        if(movieL2.contains("~")) {
          System.out.println("입장날짜: " + inputDate);
          System.out.println("금액: " + (int)(amount) + "원"); 
        }else {
          System.out.println("입장날짜: " + inputDate + ", 선착순 1명");
          System.out.println("금액: " + (int)(amount - amount * sale) + "원"); 
        }
      }
    }
  }
  
  public int getInputNum() {
    return this.inputNum;
  }
  
  public int getInputDate() {
    return this.inputDate;
  }
}
