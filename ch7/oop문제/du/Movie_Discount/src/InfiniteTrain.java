public class InfiniteTrain extends Movie{

	InfiniteTrain() {
		super(15000);
		// TODO Auto-generated constructor stub
	}

	@Override
	int discount() {
		return price - price/4;
	}

}
