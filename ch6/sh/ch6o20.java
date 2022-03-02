import java.util.Random;

public class ch6o20 {
  static int[] shuffle(int[] arr){
    for (int i=0; i<arr.length; i++)
    {
        int n = new Random().nextInt(9);  
        int tmp = arr[i];
        arr[i] = arr[n];
        arr[n] = tmp;
    }
    return arr;
}

  public static void main(String[] args) {
    int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println(java.util.Arrays.toString(original));
    int[] result = shuffle(original);
    System.out.println(java.util.Arrays.toString(result));

  }

}
