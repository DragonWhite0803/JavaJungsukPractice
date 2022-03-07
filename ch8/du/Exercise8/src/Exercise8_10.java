class Exercise8_10 {
	public static void main(String[] args) {
		try {
			method1();
			System.out.println(6);
		} catch (Exception e) {
			System.out.println(7);
		}
	}

	static void method1() throws Exception {
		try {
			method2();
			System.out.println(1);
		} catch (NullPointerException e) {
			System.out.println(2);
			throw e;
		} catch (Exception e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
		System.out.println(5);
	} // method1()

	static void method2() {
		throw new NullPointerException();
	}
}
//main -> method1 -> method2 예외발생 1실행안됨 -> 2 Catch -> 4 finally -> 5실행안됨
// -> method1이 예외 throw -> 6실행안됨 -> 7 catch

//예상답 247 맞췄음