//  class Product {
//    int price; // ��ǰ�� ����
//    int bonusPoint; // ��ǰ���� �� �����ϴ� ���ʽ�����
//
//    Product(int price) {
//      this.price = price;
//      bonusPoint = (int) (price / 10.0);
//    }
//  }
//  class Tv extends Product {
//    Tv() {}
//
//    public String toString() {
//      return "Tv";
//    }
//  }
//  public class ch7o5  {
//    public static void main(String[] args) {
//      Tv t = new Tv();
//    }
//  }


//������

class Product
{
    int price; // ��ǰ�� ����
    int bonusPoint; // ��ǰ���� �� �����ϴ� ���ʽ�����
    Product() {}
    Product(int price) {
        this.price = price;
        bonusPoint =(int)(price/10.0);
    }
}
class Tv extends Product {
    Tv() {}
    public String toString() {
        return "Tv";
    }
}

public class ch7o5 {
  public static void main(String[] args) {
    Tv t = new Tv();
  }
}
