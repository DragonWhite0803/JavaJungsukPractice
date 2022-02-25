package Chapter3;

public class Exercise3_7 {
  public static void main(String[] args) {
    int fahrenheit = 100;
    float celcius1 = (fahrenheit-32)*5/9f;
    float celcius2 = 
        celcius1 *1000 % 10 >=5 ? ((int)(celcius1*100)+1)*1/100f : (int)(celcius1*100)*1/100f ;
    System.out.println("Fahrenheit:"+fahrenheit);
    System.out.println("Celcius:"+celcius2);
    }
}
