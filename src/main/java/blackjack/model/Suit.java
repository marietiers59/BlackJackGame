package blackjack.model;

/**
 * 
 */
public enum Suit {
	
	CLUB("♣"),
	DIAMOND("♦"),
	HEART("♥"),
	SPADE("♠");
	
	/**
	 * 
	 */
	private String symbol;
	
	/**
	 * @param symbol
	 */
	private Suit(String symbol) {
		this.symbol = symbol;
	}
	
	/**
	 * @return
	 */
	public String getSymbol() {
		return symbol;
	}

}
