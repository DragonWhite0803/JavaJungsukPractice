
public class Exercise12_7 {
//	[12-7] �ֳ����̼� TestInfo�� ������ ���� ���ǵǾ� ���� ��, �� �ֳ����̼��� �ùٸ��� ������� ���� ����? 
//	
//	@interface TestInfo {
//		int count() default 1;
//		String[] value() default "aaa";
//	}

//	a. @TestInfo 		class Exercise12_7 {}
//	b. @TestInfo(1) 		class Exercise12_7 {}
//	-> ����� �̸��� value�� �ƴ� ���� ����� �̸��� ������ �� ���� ->count = 1 O
//	c. @TestInfo("bbb") 	class Exercise12_7 {}
//	d. @TestInfo("bbb","ccc") class Exercise12_7 {}	-> 
//	-> ����� ���� �迭�� ���� ��ȣ�� �����־�� �Ѵ�. -> {"bbb","ccc"} O	
}
