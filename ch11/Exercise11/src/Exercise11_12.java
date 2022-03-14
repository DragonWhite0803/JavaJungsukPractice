import java.util.HashMap;

class Exercise11_12 {
	public static void main(String args[]) throws Exception {
		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
		Player p1 = new Player("Ÿ¥", deck.pick(), deck.pick());
		Player p2 = new Player("���", deck.pick(), deck.pick());
		System.out.println(p1 + " " + deck.getPoint(p1));
		System.out.println(p2 + " " + deck.getPoint(p2));
	}
}

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];
	int pos = 0; // ������ ������ ī���� ��ġ
	HashMap jokbo = new HashMap(); // ������ ������ HashMap

	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = i < 10 && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard2(num, isKwang);
		}
		registerJokbo(); // ������ ����Ѵ�.
	}

	void registerJokbo() {

	}

	int getPoint(Player p) {
		if (p == null)
			return 0;
		SutdaCard2 c1 = p.c1;
		SutdaCard2 c2 = p.c2;
		Integer result = 0;

		return result.intValue();
	}

	SutdaCard2 pick() throws Exception {
		SutdaCard2 c = null;
		if (0 <= pos && pos < CARD_NUM) {
			c = cards[pos];
			cards[pos++] = null;
		} else {
			throw new Exception("�����ִ� ī�尡 �����ϴ�.");
		}
		return c;
	}

	void shuffle() {
		for (int x = 0; x < CARD_NUM * 2; x++) {
			int i = (int) (Math.random() * CARD_NUM);
			int j = (int) (Math.random() * CARD_NUM);
			SutdaCard2 tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
} // SutdaDeck

class Player {
	String name;
	SutdaCard2 c1;
	SutdaCard2 c2;
	int point; // - ī���� ��޿� ���� ���� ���� �߰�

	Player(String name, SutdaCard2 c1, SutdaCard2 c2) {
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
	}

	public String toString() {
		return "[" + name + "]" + c1.toString() + "," + c2.toString();
	}
} // class Player

class SutdaCard2 {
	int num;
	boolean isKwang;

	SutdaCard2() {
		this(1, true);
	}

	SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
