
public class Exercise5_4 {
	public static void main(String[] args) {
		int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, 
				{ 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
		int len = 0;	//�迭�� ����� ����
		int sum = 0;	//�迭 ������ ��
		int total = 0;	//�迭���� ����
		float average = 0;

		for (int i = 0; i<arr.length; i++ ) {
			for (int j = 0; j<arr[i].length; j++) {
				sum += arr[i][j];
				len++;
			}
			total += sum;
			sum = 0;
		}
		
		average = total*100/len*0.01f; //float ����� ���� �۾�
		
		System.out.println("total=" + total);
		System.out.println("average=" + average);
	} // end of main
}
