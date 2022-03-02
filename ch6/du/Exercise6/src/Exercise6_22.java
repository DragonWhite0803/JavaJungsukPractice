public class Exercise6_22 {
	public static boolean isNumber(String str) {
		boolean check = true;
		for(int i =0; i<str.length(); i++) {
			if(!(str.charAt(i)>=48 && str.charAt(i) <= 57)) {
				check = false;
			} 
		}
		return check;
	}
	
	public static void main(String[] args) {
	String str = "123";
	System.out.println(str+"는 숫자입니까? "+isNumber(str)); 
	str = "1234o";
	System.out.println(str+"는 숫자입니까? "+isNumber(str)); 
	}
}
