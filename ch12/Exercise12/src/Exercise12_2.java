
public class Exercise12_2 {
//	[12-2] ���׸� �޼��� makeJuice() �� �Ʒ��� ���� ���ǵǾ� ���� ��, �� �޼��带 �ùٸ��� ȣ���� ������ 
//	��� ���ÿ�. (Apple�� Grape�� Fruit�� �ڼ��̶�� ��������.)

//	class Juicer {
//		static <T extends Fruit> String makeJuice(FruitBox<T> box) {
//			String tmp = "";
//			for(Fruit f : box.getList()) tmp += f + " ";
//			return tmp;
//		}
//	}

//	a. Juicer.<Apple>makeJuice(new FruitBox<Fruit>());	-> �Ű�����Ÿ�� FruitBox<Apple> != ����Ÿ�� new FruitBox<Fruit>
//	b. Juicer.<Fruit>makeJuice(new FruitBox<Grape>());
//	c. Juicer.<Fruit>makeJuice(new FruitBox<Fruit>());	-> Fruit��ü �ڽŵ� ������
//	d. Juicer.makeJuice(new FruitBox<Apple>());	-> ���׸� �޼����� Ÿ�� ȣ���� ������ �� �ִ�.
//	e. Juicer.makeJuice(new FruitBox<Object>());
}
