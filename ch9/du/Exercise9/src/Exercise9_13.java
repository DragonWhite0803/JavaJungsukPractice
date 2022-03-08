public class Exercise9_13 {
	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
		System.out.println(src);
		System.out.println("aa��" + stringCount(src, "aa") + "�� ã�ҽ��ϴ�.");
	}

	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}

	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;

		if (key == null || key.length() == 0) {
			return 0;
		}

		while (true) {
			int idx = src.indexOf(key, pos);

			if (idx != -1) {
				pos = idx + key.length(); // ���� �ݺ��� ���� ������ġ ����
				count++;
			} else {
				break;
			}
		}

		return count;
	}
}