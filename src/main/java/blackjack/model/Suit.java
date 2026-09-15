package blackjack.model;

public enum Suit {
	
	CLUB("♣"),
	DIAMOND("♦"),
	HEART("♥"),
	SPADE("♠");
	
	private String symbol;
	
	private Suit(String symbol) {
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return symbol;
	}

}
