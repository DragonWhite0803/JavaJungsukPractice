import java.util.ArrayList;
import java.util.List;

public class SumTest {
	public static void main(String[] args) {
		Data dt1 = new Data("dt1", -12546, 51648);
		Data dt2 = new Data("dt2", 45841, 17431);
		Data dt3 = new Data("dt3", 84308, 94137);
		Data dt4 = new Data("dt4", 65421, -56230);
		Data dt5 = new Data("dt5", 58163, 62048);
		Data dt6 = new Data("dt6", 71205, -36209);
		Data dt7 = new Data("dt7", -65100, -99110);
		Data dt8 = new Data("dt8", -36019, 84104);
		Data dt9 = new Data("dt9", -65205, -35884);
		Data dt10 = new Data("dt10", 78451, 74520);

		List<Data> total = new ArrayList<Data>();
		total.add(dt1);
		total.add(dt2);
		total.add(dt3);
		total.add(dt4);
		total.add(dt5);
		total.add(dt6);
		total.add(dt7);
		total.add(dt8);
		total.add(dt9);
		total.add(dt10);

		int maxVal = 0;
		int maxIndex = 0;
		int sum = 0;

		for (int i = 0; i < total.size(); i++) {

			if ((i + 1) % 2 != 0) {
				sum += total.get(i).data1;
				sum -= total.get(i).data2;
			} else {
				sum += total.get(i).data1;
				sum += total.get(i).data2;
			}

			if (total.get(i).data1 >= maxVal) {
				maxVal = total.get(i).data1;
				maxIndex = i;
			}

			if (total.get(i).data2 >= maxVal) {
				maxVal = total.get(i).data2;
				maxIndex = i;
			}
		}

		System.out.println("총합(절대값): " + Math.abs(sum));
		System.out.println("최대값을 가지고 있는 인덱스: " + total.get(maxIndex).title);
	}
}

class Data {
	String title;
	int data1;
	int data2;

	public Data(String title, int data1, int data2) {
		this.title = title;
		this.data1 = data1;
		this.data2 = data2;
	}
}