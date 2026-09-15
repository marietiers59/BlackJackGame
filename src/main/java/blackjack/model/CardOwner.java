package blackjack.model;

public abstract class CardOwner {
	
	protected String name;
	
	protected CardOwner(String name) {
		//TODO
	}
	
	public abstract boolean isHitting();

	public void receive(Card card) {
		//TODO
	}
	
	public int getHandValue() {
		//TODO
		return 0; //changer 0
	}
	
	public boolean isBusted() {
		//TODO
		return false; //changer false ?
	}
	
	public String toString() {
		//TODO
		return null; //changer null
	}
	
}
