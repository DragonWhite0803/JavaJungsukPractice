class Outer {
	class Inner {
		int iv = 100;
	}
}

class Exercise7_25 {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.Inner li = oc.new Inner();

		System.out.println(li.iv);
	}
}
