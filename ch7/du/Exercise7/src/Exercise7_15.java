
public class Exercise7_15 {
	a. u = (Unit)ac;
	b. u = ac;
	c. GroundUnit gu = (GroundUnit)u;
	d. AirUnit au = ac;
	e. t = (Tank)u; // 자식클래스로 ㅈ조상클래스를 형변환할 수 없다
	f. GroundUnit gu = t;
}
