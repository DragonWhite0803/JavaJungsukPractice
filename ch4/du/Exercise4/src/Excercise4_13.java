public class Excercise4_13 {
	public static void main(String[] args)
	{
	String value = "12o34";
	char ch = ' ';
	boolean isNumber = true;
	// charAt(int i) 반복문과 를 이용해서 문자열의 문자를
	// . 하나씩 읽어서 검사한다
	for(int i=0; i < value.length() ;i++) {
		ch = value.charAt(i);
		if(!(ch>=48 && ch<=57)) {
			isNumber =false;
		}
	}
	if (isNumber) {
	System.out.println(value+"는 숫자입니다."); 
	} else {
	System.out.println(value+"는 숫자가 아닙니다."); 
	}
	} // end of main
}
