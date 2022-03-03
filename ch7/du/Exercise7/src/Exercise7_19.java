class Exercise7_19 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv2());
		b.buy(new Computer());
		b.buy(new Tv2());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product2[] cart = new Product2[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product cart index �迭 �� ����

	void buy(Product2 p) {
		if (money >= p.price) {
			money -= p.price;
			add(p);
		} else {
			System.out.println("�ܾ��� �����Ͽ� " + p + "��/�� ��� �����ϴ�.");
			return;
		}
	}

	void add(Product2 p) {
		if (i >= cart.length) {
			Product2[] temp = new Product2[(cart.length) * 2];
			for (int i = 0; i < cart.length; i++) {
				temp[i] = cart[i];
			}
			cart = temp;
		}
		cart[i] = p;
		i++;
	} // add(Product p)

	void summary() {
		int sum = 0;
		System.out.print("������ ����:");
		for (int i = 0; i < cart.length; i++) {
			System.out.print(cart[i] + ",");
		}
		System.out.print("\n");
		System.out.print("����� �ݾ�:");
		for (int i = 0; i < cart.length; i++) {
			sum += cart[i].price;
		}
		System.out.println(sum);
		System.out.println("�����ݾ�" + money);
	} // summary()
}

class Product2 {
	int price; // ��ǰ�� ����

	Product2(int price) {
		this.price = price;
	}
}

class Tv2 extends Product2 {
	Tv2() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product2 {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product2 {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}
