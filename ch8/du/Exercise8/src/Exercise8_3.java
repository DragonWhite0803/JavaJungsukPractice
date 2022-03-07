
public class Exercise8_3 {
	void add(int a, int b) throws InvalidNumberException, NotANumberException {
	}

	class NumberException extends Exception {
	}

	class InvalidNumberException extends NumberException {
	}

	class NotANumberException extends NumberException {
	}

//	a. void add(int a, int b) throws InvalidNumberException, NotANumberException {}
//	b. void add(int a, int b) throws InvalidNumberException {} X -> 상위 메소드에서 throw하는 Exception의 하위만 throw할 수 있다
//	c. void add(int a, int b) throws NotANumberException {}	X -> 상위 메소드에서 throw하는 Exception의 하위만 throw할 수 있다
//	d. void add(int a, int b) throws Exception {} 
//	e. void add(int a, int b) throws NumberException {} 

}
