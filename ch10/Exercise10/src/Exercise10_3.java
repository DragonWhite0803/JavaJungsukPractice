import java.text.DecimalFormat;

public class Exercise10_3 {
	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat("#,###.#");
		DecimalFormat df2 = new DecimalFormat("#,####");
		String data = "123,456,789.5";

		try {
			Number num = df.parse(data);
			System.out.println("data:" + data);

			double d = num.doubleValue();
			int convert = (int) Math.round(d);
			System.out.println("반올림:" + convert);

			System.out.println("만단위:" + df2.format(convert));
		} catch (Exception e) {
		}
	}
}