
public class Exercise6_24 {
	
	public static int abs(int value) {
		int val = 0;
		if(value>=0) {
			val = value;
		} else {
			val = -value;
		}
		return val;
	}
	
	public static void main(String[] args)
	{
	int value = 5;
	System.out.println(value+"의 절대값:"+abs(value)); 
	value = -10;
	System.out.println(value+"의 절대값:"+abs(value));
	}
}
