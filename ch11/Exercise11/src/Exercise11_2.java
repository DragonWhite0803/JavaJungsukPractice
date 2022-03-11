import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

class Exercise11_2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7); // list [3,6,2,2,2,7]
		HashSet set = new HashSet(list); // 즁복제거 ->[3,6,2,7]
		TreeSet tset = new TreeSet(set); // Treeset으로 바뀌면서 자동으로 정력되는 효과 [2,3,6,7]
		Stack stack = new Stack();
		stack.addAll(tset);
		while (!stack.empty())
			System.out.println(stack.pop()); // pop하게되면 가장 나중에 더해진 값부터 꺼내야 다음값을 꺼낼 수 있다
	} // 예상 7 6 3 2 맞았음
}