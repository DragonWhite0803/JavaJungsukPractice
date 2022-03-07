class Exercise8_5 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b) {
				throw new ArithmeticException();
			}
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}

	public static void main(String[] args) {
		method(true);	// 1호출 -> 예외발생 -> 3에서 catch -> finally 실행 5 -> catch 되었기 때문에 6실행안됨
		method(false);	// 1호출 -> 예외발생없음 -> 2호출 -> catch안함 바로 finally 5 -> catch 안함 6실행
	} // main	//135 1256
}