class Exercise9_5 {
	public static int count(String src, String target) {
		int count = 0; // ã�� Ƚ��
		int pos = 0; // ã�� ������ ��ġ

		while (true) {
			int idx = src.indexOf(target, pos);

			if (idx != -1) {
				pos = idx + target.length();
				count++;
			} else {
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));
	}
}
