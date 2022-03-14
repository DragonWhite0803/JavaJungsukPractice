import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class Exercise11_10 {
	public static void main(String[] args) {
		Set set = new LinkedHashSet(); // 바꿔주었다
		int[][] board = new int[5][5];
		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 30) + 1 + "");
		}
		Iterator it = set.iterator();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		}
	} // main
}

//HashSet은 자체적인 저장 방식으로 순서를 결정하기 때문에 비슷한 위치에 값이 저장 되는 것이다.
//이럴 경우엔 LinkedHashSet을 사용하는 것이 바람직하다.
