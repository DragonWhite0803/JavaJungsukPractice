
public class Exercise12_3 {
//	[12-3] 다음 중 올바르지 않은 문장을 모두 고르시오.

//	class Box<T extends Fruit> { //  지네릭 타입 T를 선언
//		T item;

//		void setItem(T item) { this.item = item; }

//		T getItem() { return item; }
//	}

//	a. Box<?> b = new Box();
//	b. Box<?> b = new Box<>();
// -> 타입을 생략하면 참조변수와 같은 타입으로 간주된다 OK
//	c. Box<?> b = new Box<Object>();
// -> Object타입이 Fruit에 속하지 않기 때문에 값으로 줄 수 없다
//	d. Box<Object> b = new Box<Fruit>();
// -> Object타입이 Fruit에 속하지 않기 때문에 생성할 수 없다
//	e. Box b = new Box<Fruit>();
//	f. Box<? extends Fruit> b = new Box<Apple>();
//	g. Box<? extends Object> b = new Box<? extends Fruit>(); 
// -> 이미 Fruit를 extends하는 T를 지네릭으로 선언했는데 Object객체를 상속하는 모든 객체를 지네릭으로 생성할 수 없다.
	// + new는 타입이 명확해야 하므로 와일드 카드와 사용 불가
}
//bcdg