class SutdaDeck1 {
  final int CARD_NUM = 20;
  SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

  SutdaDeck1() {
    for (int i = 0; i < cards.length; i++) {
      int num = i % 10 + 1;
      boolean isKwang = (i < 10) && ((num == 1) || (num == 3) || (num == 8));
      cards[i] = new SutdaCard2(num, isKwang);
    }
  }


  void shuffle() {
    for (int i = 0; i < cards.length; i++) {
      int j = (int) (Math.random() * cards.length);
      SutdaCard2 tmp = cards[i];
      cards[i] = cards[j];
      cards[j] = tmp;
    }
  }

  SutdaCard2 pick(int index) {
    if (index < 0 || index >= CARD_NUM)
      return null;
    return cards[index];
  }

  SutdaCard2 pick() {
    int index = (int) (Math.random() * cards.length);
    return pick(index); 
  }
}
  
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

    // info() Object toString() . 대신 클래스의 을 오버라이딩했다
    public String toString() {
      return num + (isKwang ? "K" : "");
    }
  }

public class ch7o2 {

  public static void main(String[] args) {
    SutdaDeck1 deck = new SutdaDeck1();
    System.out.println(deck.pick(0));
    System.out.println(deck.pick());
    deck.shuffle();
    for(int i=0; i < deck.cards.length;i++)
    System.out.print(deck.cards[i]+",");
    System.out.println();
    System.out.println(deck.pick(0));
  }
}

