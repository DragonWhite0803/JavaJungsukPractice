class Exercise8_6 {
	public static void main(String[] args) {
		try {
			method1(); 
		} catch (Exception e) {
			System.out.println(5);	//Nullpointer catch -> 5����
		}
	}

	static void method1() {
		try {
			method2();
			System.out.println(1);	//method2���� ���ܹ߻� 1����ȵ�
		} catch (ArithmeticException e) {
			System.out.println(2);	//�ش�ȵ� ����ȵ�
		} finally {
			System.out.println(3);	//finally 3ȣ�� 
		}
		System.out.println(4);	//catch ���ؼ� 4ȣ��
	} // method1()

	static void method2() {
		throw new NullPointerException();
	}
}

//main -> method1 -> method2(throw)

//����� 345
//������ 35 (catch�� ���ߴ��� ���ܰ� �߻����� ���� ������ ���������� �ʱ� �����ϰŶ�� ����...?
//		   �ڽ��� �ٷ� catch�� ���ص� ȣ���� ���� �޼ҵ忡�� catch�� ���ɼ��� ���ܵаɷ� ����)