
public class Exercise9_10 {
	public static String format(String str, int length, int alignment) {
		String result = "";

		if (length < str.length()) {
			for (int i = 0; i < length; i++) {
				result += str.charAt(i);
			}
		} else {
			char[] oArr = new char[str.length()];
			char[] cArr = new char[length];

			for (int i = 0; i < str.length(); i++) {
				oArr[i] = str.charAt(i);
			}

			for (int i = 0; i < cArr.length; i++) {
				cArr[i] = ' ';
			}

			if (alignment == 0) {
				System.arraycopy(oArr, 0, cArr, 0, str.length());
			} else if (alignment == 1) {
				System.arraycopy(oArr, 0, cArr, (cArr.length - str.length()) / 2, str.length());
			} else if (alignment == 2) {
				System.arraycopy(oArr, 0, cArr, cArr.length - str.length(), str.length());
			} else {
				System.out.println("올바른 정렬조건 번호가 아닙니다.");
			}

			for (int i = 0; i < cArr.length; i++) {
				result += cArr[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7, 0)); // 왼쪽 정렬
		System.out.println(format(str, 7, 1)); // 가운데 정렬
		System.out.println(format(str, 7, 2)); // 오른쪽 정렬
	}
}
