
public class runOOP {
  movieList ml = new movieList();
  inputLine il = new inputLine();
  
  public void oopTest() {
    System.out.println("------------");
    System.out.println("1." + ml.getInterstellar(0));
    System.out.println("2." + ml.getTenet(0));
    System.out.println("3." + ml.getInception(0));
    System.out.println("4." + ml.getInfinityTrain(0));
    System.out.println("5." + ml.getShawshank(0));
    System.out.println("------------");
    System.out.println("1.입장영화를 입력하시오. (1 ~ 5)");
    il.inputMovieNumDate();
    il.amount(il.getInputNum());
    
  }
}
