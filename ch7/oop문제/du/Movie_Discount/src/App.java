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
				"------------\r\n" + "1.인터스텔라\r\n" + "2.테넷\r\n" + "3.인셉션\r\n" + "4.무한 열차\r\n" + "------------");
		System.out.println("1.입장 영화를 선택하시오. (1 ~ 4)");

		Scanner sc = new Scanner(System.in);
		int monum = sc.nextInt();

		System.out.println("2.입장날짜를 입력하시오 (ex. 20220214)");
		int date = sc.nextInt();

		if (monum == 1) {
			price = m1.price;
			moname = "인터스텔라";
		} else if (monum == 2) {
			moname = "테넷";
			if (date >= 20220202 && date <= 20220310) {
				price = m2.discount();
			} else {
				price = m2.price;
			}
		
		} else if (monum == 3) {
			moname = "인셉션";
			price = m3.price;
		
		} else if (monum == 4) {
			moname = "무한 열차";
			if (date >= 20220420 && date <= 20200505) {
				price = m4.discount();
			} else {
				price = m4.price;
			}
		}

		System.out.println("입장완료: "+moname);
		System.out.println("입장날짜: " + date + ", 선착순 1명");
		System.out.println("금액: " + price);
	}
}
