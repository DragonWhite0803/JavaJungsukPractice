
public class movieList {
   private String[] interstellar = {"인터스텔라", "13000", "5", "2000","1"};
   private String[] tenet = {"테넷", "12000", "20220220~20220310", "0.1","2"};
   private String[] inception = {"인셉션", "10000", "1", "5000","3"};
   private String[] infinityTrain = {"무한 열차", "15000", "20220420~20220505", "0.25","4"};
   private String[] shawshank  = {"쇼생크 탈출", "20000", "3", "0.1","5"};
   
   public String getInterstellar(int i) {
     return this.interstellar[i];
   }
   
   public String getTenet(int i) {
     return this.tenet[i];
   }
   
   public String getInception(int i) {
     return this.inception[i];
   }
   
   public String getInfinityTrain(int i) {
     return this.infinityTrain[i];
   }
   
   public String getShawshank(int i) {
     return this.shawshank[i];
   }
  
}
