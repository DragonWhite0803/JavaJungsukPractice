public class Exercise6_9 {

	int x = 0, y = 0; // Marine (x,y) �� ��ġ��ǥ
	int hp = 60; // ���� ü��
	static int weapon = 6; // ���ݷ��� ������ �����Ƿ� static�� ��������
	static int armor = 0; // ���� =

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
