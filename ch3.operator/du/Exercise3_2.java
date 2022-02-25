package Chapter3;

class Exercise3_2 {
  public static void main(String[] args) {
    int numOfApples = 123; // 사과의 개수
    int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
    int numOfBucket = (int) Math.ceil((double)numOfApples/sizeOfBucket); //Math클래스에 올림 ceil (형변환에 유의)
    System.out.println("바구니는 "+numOfBucket+"개 필요합니다"); //필요한 바구니의 수
  }
}
