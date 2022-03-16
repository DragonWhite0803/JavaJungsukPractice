
public class Exercise12_7 {
//	[12-7] 애너테이션 TestInfo가 다음과 같이 정의되어 있을 때, 이 애너테이션이 올바르게 적용되지 않은 것은? 
//	
//	@interface TestInfo {
//		int count() default 1;
//		String[] value() default "aaa";
//	}

//	a. @TestInfo 		class Exercise12_7 {}
//	b. @TestInfo(1) 		class Exercise12_7 {}
//	-> 요소의 이름이 value가 아닐 때는 요소의 이름을 생략할 수 없다 ->count = 1 O
//	c. @TestInfo("bbb") 	class Exercise12_7 {}
//	d. @TestInfo("bbb","ccc") class Exercise12_7 {}	-> 
//	-> 요소의 값이 배열일 때는 괄호로 묶어주어야 한다. -> {"bbb","ccc"} O	
}
