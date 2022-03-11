import java.util.ArrayList;

class Exercise11_1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList(); // 교집합
		ArrayList cha = new ArrayList(); // 차집합
		ArrayList hap = new ArrayList(); // 합집합
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);

		kyo.addAll(list1); // list1의 모든 객체 추가
		kyo.retainAll(list2); // list2와 겹치는 객체를 제외한 모든 객체 삭제

		cha.addAll(list1); // list1의 모든 객체 추가
		cha.removeAll(kyo);// 교집합 삭제 -> 차집합

		hap.addAll(cha); // 차집합 + 두번째 집합 -> 합집합
		hap.addAll(list2);

		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);
	}
}