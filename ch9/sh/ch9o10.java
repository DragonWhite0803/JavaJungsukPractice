public class ch9o10 {
  public static String format(String str, int length, int alignment) {

    char[] arr;

    if (length < str.length()) {
      return str.substring(0, length);
    } else {
      arr = new char[length];
      for (int i = 0; i < length; i++) {
        arr[i] = ' ';
      }
    }

    if (alignment == 0) {
      System.arraycopy(str.toCharArray(), 0, arr, 0, str.length());
    } else if (alignment == 1) {
      int start = (length - str.length()) / 2;
      System.arraycopy(str.toCharArray(), 0, arr, start, str.length());
    } else {
      int start = length - str.length();
      System.arraycopy(str.toCharArray(), 0, arr, start, str.length());
    }

    String ret = "";

    for (int i = 0; i < length; i++) {
      ret += arr[i];
    }
    return ret;
  }


  public static void main(String[] args) {
    String str = "°¡³ª´Ù";
    System.out.println(format(str, 7, 0));
    System.out.println(format(str, 7, 1));
    System.out.println(format(str, 7, 2));
  }
}
