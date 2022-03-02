
public class ch6o9 {
  class Marine {
    int x=0, y=0; // Marine (x,y) 의 위치좌표
    int hp = 60; // 현재 체력
    int weapon = 6; // 공격력
    int armor = 0; // 방어력
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
    }//답:weapon, armor
     //설명:모든 병사의 공격력,방어력은 같아야 하기 때문에 공유 가능한 static(클래스 변수)로 해야한다
}
