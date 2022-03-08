class Exercise9_9 {
	public static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src);

		for (int i = 0; i < delCh.length(); i++) {
			int pos = 0;
			while (true) { // delCh�� i ��° �������� ��� �ߺ����� ���� �ɶ����� �ݺ�

				int idx = src.indexOf(delCh.charAt(i), pos);

				if (idx != -1) {
					pos = idx + 1; // ���� �ݺ��� ���� ������ġ ����
					sb.deleteCharAt(idx); // �ش��ε��� ����
					src = sb.toString(); // src�� sb�� ����ȭ ���־�� ���������� ���� �ε��� ���� ��������
				} else {
					break;
				}
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}
}