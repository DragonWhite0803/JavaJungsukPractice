
public class Exercise7_17 {

}

class Unit {
	int x, y; // ���� ��ġ

	public void move(int x, int y) {
		/* ������ ��ġ�� �̵� */ }

	void stop() {
		/* ���� ��ġ�� ���� */ }

}

class Marine extends Unit { // ����
	Unit u = new Unit();

	void stimPack() {
		/* �������� ����Ѵ�. */}
}

class Tank extends Unit { // ��ũ
	Unit u = new Unit();

	void changeMode() {
		/* ���ݸ�带 ��ȯ�Ѵ�. */}
}

class Dropship extends Unit { // ���ۼ�
	Unit u = new Unit();

	void load() {
		/* ���õ� ����� �¿��. */ }

	void unload() {
		/* ���õ� ����� ������. */ }
}