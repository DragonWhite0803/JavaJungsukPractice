import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Interstella m1 = new Interstella();
		Tenet m2 = new Tenet();
		Inception m3 = new Inception();
		InfiniteTrain m4 = new InfiniteTrain();

		int price = 0;
		String moname = "";

		System.out.println(
				"------------\r\n" + "1.���ͽ��ڶ�\r\n" + "2.�׳�\r\n" + "3.�μ���\r\n" + "4.���� ����\r\n" + "------------");
		System.out.println("1.���� ��ȭ�� �����Ͻÿ�. (1 ~ 4)");

		Scanner sc = new Scanner(System.in);
		int monum = sc.nextInt();

		System.out.println("2.���峯¥�� �Է��Ͻÿ� (ex. 20220214)");
		int date = sc.nextInt();

		if (monum == 1) {
			price = m1.price;
			moname = "���ͽ��ڶ�";
		} else if (monum == 2) {
			moname = "�׳�";
			if (date >= 20220202 && date <= 20220310) {
				price = m2.discount();
			} else {
				price = m2.price;
			}
		
		} else if (monum == 3) {
			moname = "�μ���";
			price = m3.price;
		
		} else if (monum == 4) {
			moname = "���� ����";
			if (date >= 20220420 && date <= 20200505) {
				price = m4.discount();
			} else {
				price = m4.price;
			}
		}

		System.out.println("����Ϸ�: "+moname);
		System.out.println("���峯¥: " + date + ", ������ 1��");
		System.out.println("�ݾ�: " + price);
	}
}
