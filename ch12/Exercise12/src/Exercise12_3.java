
public class Exercise12_3 {
//	[12-3] ���� �� �ùٸ��� ���� ������ ��� ���ÿ�.

//	class Box<T extends Fruit> { //  ���׸� Ÿ�� T�� ����
//		T item;

//		void setItem(T item) { this.item = item; }

//		T getItem() { return item; }
//	}

//	a. Box<?> b = new Box();
//	b. Box<?> b = new Box<>();
// -> Ÿ���� �����ϸ� ���������� ���� Ÿ������ ���ֵȴ� OK
//	c. Box<?> b = new Box<Object>();
// -> ObjectŸ���� Fruit�� ������ �ʱ� ������ ������ �� �� ����
//	d. Box<Object> b = new Box<Fruit>();
// -> ObjectŸ���� Fruit�� ������ �ʱ� ������ ������ �� ����
//	e. Box b = new Box<Fruit>();
//	f. Box<? extends Fruit> b = new Box<Apple>();
//	g. Box<? extends Object> b = new Box<? extends Fruit>(); 
// -> �̹� Fruit�� extends�ϴ� T�� ���׸����� �����ߴµ� Object��ü�� ����ϴ� ��� ��ü�� ���׸����� ������ �� ����.
	// + new�� Ÿ���� ��Ȯ�ؾ� �ϹǷ� ���ϵ� ī��� ��� �Ұ�
}
//bcdg