class Parent {
	int x = 100;

	Parent() { // 1
		this(200);
	}

	Parent(int x) { // 2
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() { // 3
		this(1000);
	}

	Child(int x) { // 4
		this.x = x;
	}
}

class Exercise7_7 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x=" + c.getX()); // x = 200
	}
}