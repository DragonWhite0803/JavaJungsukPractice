public class Exercise6_9 {

	int x = 0, y = 0; // Marine (x,y) 의 위치좌표
	int hp = 60; // 현재 체력
	static int weapon = 6; // 공격력은 변하지 않으므로 static을 붙혀야함
	static int armor = 0; // 방어력 =

	void weaponUp() {
		weapon++;
	}

	void armorUp() {
		armor++;
	}

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
