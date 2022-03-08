class Exercise9_9 {
	public static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src);

		for (int i = 0; i < delCh.length(); i++) {
			int pos = 0;
			while (true) { // delCh의 i 번째 값에대해 모든 중복값이 제거 될때까지 반복

				int idx = src.indexOf(delCh.charAt(i), pos);

				if (idx != -1) {
					pos = idx + 1; // 다음 반복을 위해 시작위치 갱신
					sb.deleteCharAt(idx); // 해당인덱스 삭제
					src = sb.toString(); // src와 sb를 동기화 해주어야 다음삭제시 같은 인덱스 값을 삭제가능
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