package Chapter3;

class Exercise3_2 {
  public static void main(String[] args) {
    int numOfApples = 123; // ����� ����
    int sizeOfBucket = 10; // ( ) �ٱ����� ũ�� �ٱ��Ͽ� ���� �� �ִ� ����� ����
    int numOfBucket = (int) Math.ceil((double)numOfApples/sizeOfBucket); //MathŬ������ �ø� ceil (����ȯ�� ����)
    System.out.println("�ٱ��ϴ� "+numOfBucket+"�� �ʿ��մϴ�"); //�ʿ��� �ٱ����� ��
  }
}
