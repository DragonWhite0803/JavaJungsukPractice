
public class Exercise12_2 {
//	[12-2] 지네릭 메서드 makeJuice() 가 아래와 같이 정의되어 있을 때, 이 메서드를 올바르게 호출한 문장을 
//	모두 고르시오. (Apple과 Grape는 Fruit의 자손이라고 가정하자.)

//	class Juicer {
//		static <T extends Fruit> String makeJuice(FruitBox<T> box) {
//			String tmp = "";
//			for(Fruit f : box.getList()) tmp += f + " ";
//			return tmp;
//		}
//	}

//	a. Juicer.<Apple>makeJuice(new FruitBox<Fruit>());	-> 매개변수타입 FruitBox<Apple> != 변수타입 new FruitBox<Fruit>
//	b. Juicer.<Fruit>makeJuice(new FruitBox<Grape>());
//	c. Juicer.<Fruit>makeJuice(new FruitBox<Fruit>());	-> Fruit객체 자신도 가능함
//	d. Juicer.makeJuice(new FruitBox<Apple>());	-> 지네릭 메서드의 타입 호출은 생략할 수 있다.
//	e. Juicer.makeJuice(new FruitBox<Object>());
}
