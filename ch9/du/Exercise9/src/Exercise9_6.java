class Exercise9_6 {
	public static String fillZero(String src, int length) {
		if (src == null || src.length() == length) {
			return src;

		} else if (length <= 0) {
			return "";

		} else if (src.length() > length) {
			String splice = "";
			for (int i = 0; i < length; i++) {
				splice += src.charAt(i);
			}
			return splice;

		} else {
			char[] cv = new char[length];
			String result = "";

			for (int i = 0; i < cv.length; i++) {
				cv[i] = '0';
			}
			for (int i = 0; i < src.length(); i++) {
				cv[length - src.length() + i] = src.charAt(i); // src값을 복사해서 넣어줌
			}
			for (int i = 0; i < cv.length; i++) {
				result += cv[i]; // cv를 result문자열에 하나씩 더해줌
			}
			return result;
		}
	}

	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));
	}
}