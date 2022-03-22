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

//a. 01021233454567689789처럼 0부터 9까지의 숫자가 섞여서 출력된다
//b. 01234567890123456789처럼 0부터 9까지의 숫자가 순서대로 출력된다 -> 순서대로 출력될 것 같다 (정답)
//c. IllegalThreadStateException이 발생한다