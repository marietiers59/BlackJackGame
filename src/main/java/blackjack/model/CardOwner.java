package blackjack.model;

/**
 * 
 */
public abstract class CardOwner {
	
	/**
	 * 
	 */
	protected String name;
	
	/**
	 * @param name
	 */
	protected CardOwner(String name) {
		//TODO
	}
	
	/**
	 * @return
	 */
	public abstract boolean isHitting();

	/**
	 * @param card
	 */
	public void receive(Card card) {
		//TODO
	}
	
	/**
	 * @return
	 */
	public int getHandValue() {
		//TODO
		return 0; //changer 0
	}
	
	/**
	 * @return
	 */
	public boolean isBusted() {
		//TODO
		return false; //changer false ?
	}
	
	/**
	 *
	 */
	public String toString() {
		//TODO
		return null; //changer null
	}
	
}
