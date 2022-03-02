
public class ch5o1 {

  public static void main(String[] args) {
    int[] arr[];
    int[] arr = {1,2,3,};
    int[] arr = new int[5];
    int[] arr = new int[5]{1,2,3,4,5};//해당 라인의 배열의 크기는 {}괄호 안에 들어가는 데이터의 갯수에 따라 크기가 자동결정 되기 때문에 이 라인의 두번째 대괄호 부분에서 크기를 지정한 것이 오답이다. 
    int arr[5];//배열을 선언 할 땐 크기를 지정 할 수 없으므로 잘못된 선언방법이다. 크기를 지정하려면 선언 후 크기 지정을 해줘야한다. ex) int arr[] = new int[3]
    int[] arr[] = new int[3][];
  }

}
