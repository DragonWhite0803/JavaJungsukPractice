class Exercise13_2 {
	public static void main(String[] args) {
		Thread2 t1 = new Thread2();
		t1.run();
		for (int i = 0; i < 10; i++)
			System.out.print(i);
	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.print(i);
	}
}

//a. 01021233454567689789ó�� 0���� 9������ ���ڰ� ������ ��µȴ�
//b. 01234567890123456789ó�� 0���� 9������ ���ڰ� ������� ��µȴ� -> ������� ��µ� �� ���� (����)
//c. IllegalThreadStateException�� �߻��Ѵ�