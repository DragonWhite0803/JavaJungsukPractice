public class Inception extends Movie {

	Inception() {
		super(10000);
		// TODO Auto-generated constructor stub
	}

	@Override
	int discount() {
		return price - 5000;
	}

}
