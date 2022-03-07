class Exercise8_7 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b)
				System.exit(0);
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
		method(true);	//1호출 -> 시스템 종료 
		method(false);	//1호출 -> if문 실행 안됨 2호출> 예외없음 catch안일어남 finally 5-> 6호출
	} // main
}

//예상 11256
//실제 답 1 -> system.exit(0)으로 인해 메인 메서드 또한 강제종료 된것이 원인으로 보임