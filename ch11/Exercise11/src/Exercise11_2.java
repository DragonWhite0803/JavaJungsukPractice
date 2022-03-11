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
		HashSet set = new HashSet(list); // �O������ ->[3,6,2,7]
		TreeSet tset = new TreeSet(set); // Treeset���� �ٲ�鼭 �ڵ����� ���µǴ� ȿ�� [2,3,6,7]
		Stack stack = new Stack();
		stack.addAll(tset);
		while (!stack.empty())
			System.out.println(stack.pop()); // pop�ϰԵǸ� ���� ���߿� ������ ������ ������ �������� ���� �� �ִ�
	} // ���� 7 6 3 2 �¾���
}