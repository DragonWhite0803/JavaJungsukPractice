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
//main -> method1 -> method2 ���ܹ߻� 1����ȵ� -> 2 Catch -> 4 finally -> 5����ȵ�
// -> method1�� ���� throw -> 6����ȵ� -> 7 catch

//����� 247 ������