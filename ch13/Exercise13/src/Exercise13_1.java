//class Exercise13_1 {
//	public static void main(String args[]) {
//		Thread1 th1 = new Thread1();
//		th1.start();
//	}
//}
//
//class Thread1 extends Thread {
//	public void run() {
//		for (int i = 0; i < 300; i++) {
//			System.out.print('-');
//		}
//	}
//}

class Exercise13_1 {
	public static void main(String args[]) {
		Runnable r = new Thread1();
		Thread t1 = new Thread(r);

		t1.start();
	}
}

class Thread1 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print('-');
		}
	}
}
