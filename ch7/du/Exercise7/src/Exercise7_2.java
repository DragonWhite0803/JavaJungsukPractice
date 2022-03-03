class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

	SutdaDeck2() {
		for (int i = 0; i < CARD_NUM; i++) {
			if (i <= 10) {
				cards[i] = new SutdaCard2(i + 1, i == 0 || i == 2 || i == 7 ? true : false);
			} else {
				cards[i] = new SutdaCard2(i - 9, false);
			}

		}
	}

	void shuffle() {
		for (int i = 0; i < cards.length - 10; i++) {
			SutdaCard2 tmp = new SutdaCard2();
			int ran = (int) (Math.random() * 100 % 20);

			tmp = cards[i];
			cards[i] = cards[ran];
			cards[ran] = tmp;
		}
	}

	SutdaCard2 pick(int a) {
		return cards[a];
	}

	SutdaCard2 pick() {
		return cards[(int) (Math.random() * 100 % 20)];
	}
} // SutdaDeck

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

class Exercise7_2 {
	public static void main(String args[]) {
		SutdaDeck2 deck = new SutdaDeck2();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
