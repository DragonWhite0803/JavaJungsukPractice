//클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은? (모두 고르시오.)
//
//class AirUnit extends Unit {}
//class GroundUnit extends Unit {}
//class Tank extends GroundUnit {}
//class AirCraft extends AirUnit {}
//
//Unit u = new GroundUnit();
//Tank t = new Tank();
//AirCraft ac = new AirCraft();

//1 u = (Unit)ac;
//2 u = ac;
//3 GroundUnit gu = (GroundUnit)u;
//4 AirUnit au = ac;
//5 t = (Tank)u;
//6 GroundUnit gu = t;

//답 5, 부모타입의 인스턴스를 자식타입으로 형변환 할 수 없다.



//더 복습 할 내용
public class ch7o15 {

}
