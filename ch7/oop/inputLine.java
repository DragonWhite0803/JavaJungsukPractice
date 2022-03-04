import java.util.Scanner;

public class inputLine {
  private int inputNum;
  private int inputDate;
  
  dateTrueCheck datechk = new dateTrueCheck();
  movieList ml = new movieList();
  
  public void inputMovieNumDate() {
    Scanner sc = new Scanner(System.in);
    inputNum = sc.nextInt();
    if (inputNum == 1) { // �ش� if���� �����͸� HashMap ������� Ű���� �� ���� ���� �� ���� �ִ�.
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
      System.out.println("��ȭ���� ��ȣ�� �°� �ٽ� �Է��Ϸ� ������");
      System.exit(0);
    }
    System.out.println("2.���峯¥�� �Է��Ͻÿ� (ex 20220214)");
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
        System.out.println("3.������\n");
        System.out.println("����Ϸ�");
        System.out.println("���峯¥: " + inputDate);
        System.out.println("�ݾ�:" + (int)(amount - sale) + "��");
      }else {
        double amount = Double.parseDouble(movieL1);
        double sale = Double.parseDouble(movieL3);
        System.out.println("3.������\n");
        System.out.println("����Ϸ�");
        System.out.println("���峯¥: " + inputDate);
        System.out.println("�ݾ�:" + (int)(amount - amount * sale) + "��");
      }
    }else {
      if(Double.parseDouble(movieL3) > 1 ) {
        int amount = Integer.parseInt(movieL1);
        int sale = Integer.parseInt(movieL3);
        System.out.println("3.������\n");
        System.out.println("����Ϸ�");
        System.out.println("���峯¥: " + inputDate + ", ������ 1��");
        System.out.println("�ݾ�:" + (int)(amount - sale) + "��");
      }else {
        double amount = Double.parseDouble(movieL1);
        double sale = Double.parseDouble(movieL3);
        System.out.println("3.������\n");
        System.out.println("����Ϸ�");
        if(movieL2.contains("~")) {
          System.out.println("���峯¥: " + inputDate);
          System.out.println("�ݾ�: " + (int)(amount) + "��"); 
        }else {
          System.out.println("���峯¥: " + inputDate + ", ������ 1��");
          System.out.println("�ݾ�: " + (int)(amount - amount * sale) + "��"); 
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
