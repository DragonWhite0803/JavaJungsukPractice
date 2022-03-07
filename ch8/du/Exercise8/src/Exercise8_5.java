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
		method(true);	// 1ȣ�� -> ���ܹ߻� -> 3���� catch -> finally ���� 5 -> catch �Ǿ��� ������ 6����ȵ�
		method(false);	// 1ȣ�� -> ���ܹ߻����� -> 2ȣ�� -> catch���� �ٷ� finally 5 -> catch ���� 6����
	} // main	//135 1256
}