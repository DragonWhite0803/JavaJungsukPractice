
public class Exercise6_18 {
	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
	static int cv2 = iv; // A ���� non-static ������ static�� ���� �� ����

	static void staticMethod1() {
		System.out.println(cv);
		System.out.println(iv); // B ���� non-static ������ static�� ���� �� ����
	}

	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // C ����
	}

	static void staticMethod2() {
		staticMethod1();
		instanceMethod1(); // D ���� non-static �޼ҵ带 static�� ���� �� ����
	}

	void instanceMethod2() {
		staticMethod1(); // E ����
		instanceMethod1();
	}
}
