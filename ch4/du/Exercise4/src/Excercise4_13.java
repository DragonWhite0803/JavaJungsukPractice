public class Excercise4_13 {
	public static void main(String[] args)
	{
	String value = "12o34";
	char ch = ' ';
	boolean isNumber = true;
	// charAt(int i) �ݺ����� �� �̿��ؼ� ���ڿ��� ���ڸ�
	// . �ϳ��� �о �˻��Ѵ�
	for(int i=0; i < value.length() ;i++) {
		ch = value.charAt(i);
		if(!(ch>=48 && ch<=57)) {
			isNumber =false;
		}
	}
	if (isNumber) {
	System.out.println(value+"�� �����Դϴ�."); 
	} else {
	System.out.println(value+"�� ���ڰ� �ƴմϴ�."); 
	}
	} // end of main
}
