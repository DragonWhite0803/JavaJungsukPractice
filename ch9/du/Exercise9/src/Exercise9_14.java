import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Exercise9_14 {
	public static void main(String[] args) {
		String[] phoneNumArr = { "012-3456-7890", "099-2456-7980", "088-2346-9870", "013-3456-7890" };
		ArrayList list = new ArrayList();
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print(">>");
			String input = s.nextLine().trim();
			Pattern p = Pattern.compile(".*" + input + ".*"); // input을 포함한 모든 번호를 패턴으로 지정

			if (input.equals("")) {
				continue;
			} else if (input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}

			for (int i = 0; i < phoneNumArr.length; i++) {
				Matcher m = p.matcher(phoneNumArr[i]);
				if (m.matches()) {
					list.add(phoneNumArr[i]); // match 할경우 해당 번호를 list에 추가
				}
			}

			if (list.size() > 0) {
				System.out.println(list);
				list.clear();
			} else {
				System.out.println("일치하는 번호가 없습니다.");
			}
		}
	} // main
}
