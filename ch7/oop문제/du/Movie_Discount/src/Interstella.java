class Interstella extends Movie {

	Interstella() {
		super(13000);
	}

	@Override
	int discount() {
		return price - 2000;
	}

}