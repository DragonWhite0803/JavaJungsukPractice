
public class Exercise6_13 {
	long add(int a, int b) { return a+b;}

	
	a. long add(int x, int y) { return x+y;} //매개변수의 이름이 다르다 X
	b. long add(long a, long b) { return a+b;}
	c. int add(byte a, byte b) { return a+b;} //리턴값을 byte로 형변환 해야한다 X
	d. int add(long a, int b) { return (int)(a+b);}
}
