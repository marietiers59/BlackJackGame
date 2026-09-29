package blackjack.model;

/**
 * 
 */
public class Deck {
	
	/**
	 * 
	 */
	private Deck() {
		//VIDE POUR LE MOMENT
	}
	
	/**
	 * @return
	 */
	public Deck create52CardsDeck() {
		//TODO
		return null; //changer null
	}
	
	/**
	 * 
	 */
	public void shuffle() {
		//TODO
	}
	
	/**
	 * @param card
	 */
	public void add(Card card) { // une carte entre, rien ne sort
		//TODO taille deck++, carte du dessus change (value et suit), carte du dessus indice++
	}
	
	/**
	 * @return
	 */
	public Card withdraw() { // rien n'entre, une carte sort
		//TODO taille deck--, carte du dessus change (value et suit), carte du dessus indice--
		return null; //changer null
	}
	
}