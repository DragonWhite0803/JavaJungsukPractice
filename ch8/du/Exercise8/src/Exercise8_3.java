
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
//	b. void add(int a, int b) throws InvalidNumberException {} X -> ���� �޼ҵ忡�� throw�ϴ� Exception�� ������ throw�� �� �ִ�
//	c. void add(int a, int b) throws NotANumberException {}	X -> ���� �޼ҵ忡�� throw�ϴ� Exception�� ������ throw�� �� �ִ�
//	d. void add(int a, int b) throws Exception {} 
//	e. void add(int a, int b) throws NumberException {} 

}
