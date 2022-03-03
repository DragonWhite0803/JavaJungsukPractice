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
      System.out.println("�ܾ��� �����Ͽ�" + p + " ��/�� �� �� �����ϴ�.");
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
        // 1.1 ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ�.
        itemList += cart[i] + ",";
        // 1.2 ��ٱ��Ͽ� ��� ���ǵ��� ������ ��� ���ؼ� ����Ѵ�.
        sum += cart[i].price;
        }
    // 1.3 ������ ��� ���� �ݾ� (money)�� ����Ѵ�.
        System.out.println("������ ����:"+itemList);
        System.out.println("����� �ݾ�:"+sum); 
        System.out.println("���� �ݾ�:"+money); 
    } // summary()
  } // summary()



class Product1 {
  int price; // ��ǰ�� ����

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
