class Exercise8_9 {
	public static void main(String[] args) throws Exception {
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
	}
}

class UnsupportedFuctionException extends RuntimeException {
	private final int ERR_CODE;
	private final String MESSAGE;

	public UnsupportedFuctionException(String MESSAGE, int ERR_CODE) {
		this.ERR_CODE = ERR_CODE;
		this.MESSAGE = MESSAGE;
	}

	public int getErrorCode(int ERR_CODE) {
		return ERR_CODE;
	}

	@Override
	public String getMessage() {
		return "[" + getErrorCode(ERR_CODE) + "]" + MESSAGE;
	}

}
