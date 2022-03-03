public class ch7o19 {
  public static void main(String args[]) {
    Buyer b = new Buyer();
    b.buy(new Tv1());
    b.buy(new Computer());
    b.buy(new Tv1());
    b.buy(new Audio());
    b.buy(new Computer());
    b.buy(new Computer());
    b.buy(new Computer());
    b.summary();
  }
}


class Buyer {
  int money = 1000;
  Product1[] cart = new Product1[3]; 
  int i = 0; 
  void buy(Product1 p) {
    if (money < p.price) {
      System.out.println("잔액이 부족하여" + p + " 을/를 살 수 없습니다.");
      return;
    }
    money -= p.price;
    add(p);
  }

  void add(Product1 p) {
    if (i >= cart.length) {
      Product1[] tmp = new Product1[cart.length * 2];
      System.arraycopy(cart, 0, tmp, 0, cart.length);
      cart = tmp;
    }
    cart[i++] = p;
  } 

 

  void summary() {
    String itemList = "";
    int sum = 0;
    for(int i=0; i < cart.length;i++) {
        if(cart[i]==null)
            break;
        // 1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
        itemList += cart[i] + ",";
        // 1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
        sum += cart[i].price;
        }
    // 1.3 물건을 사고 남은 금액 (money)를 출력한다.
        System.out.println("구입한 물건:"+itemList);
        System.out.println("사용한 금액:"+sum); 
        System.out.println("남은 금액:"+money); 
    } // summary()
  } // summary()



class Product1 {
  int price; // 제품의 가격

  Product1(int price) {
    this.price = price;
  }
}


class Tv1 extends Product1 {
  Tv1() {
    super(100);
  }

  public String toString() {
    return "Tv";
  }
}


class Computer extends Product1 {
  Computer() {
    super(200);
  }

  public String toString() {
    return "Computer";
  }
}


class Audio extends Product1 {
  Audio() {
    super(50);
  }

  public String toString() {
    return "Audio";
  }
}
