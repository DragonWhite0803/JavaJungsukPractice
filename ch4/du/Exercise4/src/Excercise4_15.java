public class Excercise4_15 {
	public static void main(String[] args){
		int number = 123454321;
		int tmp = number;
		int result =0; // number ���� �� �Ųٷ� ��ȯ�ؼ� ���� ����
		while(tmp !=0) {
			result += tmp%10;	//result ���� tmp�� 10���� ���� ������ ���ϱ�
			tmp = (tmp - tmp%10)/10; //tmp���� ���ڸ��� �����ִ� �۾�
			result *=10;			//���� �ݺ��� �ٽ� 1���ڸ��� ���ϱ� ���� 10����
		}
		if(number == result/10)		//������ �ݺ� �� ���ʿ��ϰ� 10�� �������Ƿ� result/10�� ����
			System.out.println( number + "�� ȸ���� �Դϴ�."); 
		else
			System.out.println( number + "�� ȸ������ �ƴմϴ�."); 
	} // main
}
