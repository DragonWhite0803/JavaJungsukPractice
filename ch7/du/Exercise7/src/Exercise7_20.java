class Exercise7_20 {
	public static void main(String[] args) {
		Parent2 p = new Child2(); // Child ȣ��
		Child2 c = new Child2(); // Child ȣ��
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent2 {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child2 extends Parent2 {
	int x = 200;

	void method() {
		System.out.println("Child Method");
	}
}

//p.x = 100 ���� Parent���� ����������
//Child Method	�޼ҵ�� Child�� �޼ҵ带 ����Ѵ�
//c.x = 200
//Child Method
