public class Exercise6_6 {
	// (x,y) (x1,y1) . �� �� �� ���� �Ÿ��� ���Ѵ�
	static double getDistance(int x, int y, int x1, int y1) {
		double sum = Math.pow(x-x1, 2) + Math.pow(y-y1, 2);
		return Math.sqrt(sum);
	}
	public static void main(String args[]) {
	System.out.println(getDistance(1,1,2,2));
	}

}
