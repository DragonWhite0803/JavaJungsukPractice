public class Tenet extends Movie{

	Tenet() {
		super(12000);
		
	}

	@Override
	int discount() {
		return price-price/10;
	}

}
