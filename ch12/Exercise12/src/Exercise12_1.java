
public class Exercise12_1 {
//	[12-1] 클래스 Box가 다음과 같이 정의되어 있을 때, 다음 중 오류가 발생하는 문장은?
//	경고가 발생하는 문장은?

//	class Box<T> { // T 지네릭 타입 를 선언
//	T item;

//	void setItem(T item) { this.item = item; }
//	T getItem() { return item; }
//	}

//	a. Box<Object> b = new Box<String>(); -> 대입된 타입이 같아야 한다
//	b. Box<Object> b = (Object)new Box<String>(); -> Box<Object> 타입과 <Object> 타입은 다르다.
//	c. new Box<String>().setItem(new Object()); -> String 타입 객체 Box에는 Object 타입 객체를 setItem 할 수 없다.
//	d. new Box<String>().setItem("ABC");
}
