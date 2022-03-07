class Exercise8_6 {
	public static void main(String[] args) {
		try {
			method1(); 
		} catch (Exception e) {
			System.out.println(5);	//Nullpointer catch -> 5실행
		}
	}

	static void method1() {
		try {
			method2();
			System.out.println(1);	//method2에서 예외발생 1실행안됨
		} catch (ArithmeticException e) {
			System.out.println(2);	//해당안됨 실행안됨
		} finally {
			System.out.println(3);	//finally 3호출 
		}
		System.out.println(4);	//catch 못해서 4호출
	} // method1()

	static void method2() {
		throw new NullPointerException();
	}
}

//main -> method1 -> method2(throw)

//예상답 345
//실제답 35 (catch를 못했더라도 예외가 발생하지 않은 것으로 간주하지는 않기 때문일거라고 추정...?
//		   자신이 바로 catch를 못해도 호출한 상위 메소드에서 catch할 가능성을 남겨둔걸로 보임)