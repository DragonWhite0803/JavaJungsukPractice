
public class Exercise8_4 {
	void method() throws InvalidNumberException, NotANumberException {}
	class NumberException extends RuntimeException {}
	class InvalidNumberException extends NumberException {}
	class NotANumberException extends NumberException {}
	
//	a. try {method();} catch(Exception e) {}
	
//	b. try {method();} catch(NumberException e) {} catch(Exception e) {}
	
//	c. try {method();} catch(Exception e) {} catch(NumberException e) {} //두번째 catch문은 실행될 일이 없기 때문에 오류가 발생한다.
	
//	d. try {method();} catch(InvalidNumberException e) {} 
//					   catch(NotANumberException e) {}	
	
//	e. try {method();} catch(NumberException e) {}	
	
//	f. try {method();} catch(RuntimeException e) {}
}
