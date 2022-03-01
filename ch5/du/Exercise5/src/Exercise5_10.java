public class Exercise5_10 {
  public static void main(String[] args) {
    char[] abcCode = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+',
        '=', '|', '[', ']', '{', '}', ';', ':', ',', '.', '/'};

    char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'}; // 0 1 2 3 4 5 6 7 8 9

    String src = "abc123";
    String result = "";

    // src charAt() result 문자열 의 문자를 으로 하나씩 읽어서 변환 후 에 저장
    for (int i = 0; i < src.length(); i++) {
      char ch = src.charAt(i);

      if (ch >= 97 && ch <= 122) {
        result += abcCode[ch - 97];
      } else if (ch >= 48 && ch <= 57) {
        result += numCode[ch - 48];
      }
    }

    System.out.println("src:" + src);
    System.out.println("result:" + result);
  } // end of main

}
