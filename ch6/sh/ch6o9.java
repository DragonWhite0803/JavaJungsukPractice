
public class ch6o9 {
  class Marine {
    int x=0, y=0; // Marine (x,y) �� ��ġ��ǥ
    int hp = 60; // ���� ü��
    int weapon = 6; // ���ݷ�
    int armor = 0; // ����
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
    }//��:weapon, armor
     //����:��� ������ ���ݷ�,������ ���ƾ� �ϱ� ������ ���� ������ static(Ŭ���� ����)�� �ؾ��Ѵ�
}
