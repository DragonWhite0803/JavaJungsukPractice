package Chapter3;

public class Exercise3_1 {
  public static void main(String[] args) {
    int x = 2;
    int y = 5;
    char c = 'A'; // 'A' 65 의 문자코드는
    System.out.println(1 + x << 33); // int는 32비트이기 때문에 넘어가면 다시 원상태 x+1->11 ->33비트 시프트 ->110=6
    System.out.println(y >= 5 || x < 0 && x > 2); //y가 >=5 거나 x<0,x>2를 동시에 만족할경우 true (y>=5이므로 true)
    System.out.println(y += 10 - x++); //y=y+10 -> 15-2=13 (x++은 나중에 연산됨 x = 3)
    System.out.println(x+=2); // x=x+2 (x=3이므로 5)
    System.out.println( !('A' <= c && c <='Z') ); //둘다 충족하지 않으면 true ->A<=c true, c<=Z true 따라서 false
    System.out.println('C'-c); //'C' = 67 -> 67-65=2
    System.out.println('5'-'0'); // 문자코드끼리의 연산 -> 53-58 = 5
    System.out.println(c+1); //65+1 = 66
    System.out.println(++c); // 65+1 = 66->B
    System.out.println(c++); // +1우선순위가 떨어짐 따라서 B
    System.out.println(c); //위에서 증감연산 일어남 C
    }

}
