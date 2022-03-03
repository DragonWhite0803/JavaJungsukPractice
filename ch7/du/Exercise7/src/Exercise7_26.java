
class Outer2 {
	static class Inner {
		int iv = 200;
	}
}

class Exercise7_26 {
	public static void main(String[] args) {
		Outer2.Inner li = new Outer2.Inner();

		System.out.println(li.iv);
	}
}
