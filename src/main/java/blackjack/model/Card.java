package blackjack.model;

import blackjack.model.Deck;
import blackjack.model.Suit;
import blackjack.model.Value;

/**
 * 
 */
@SuppressWarnings("unused")
public class Card {
	
	/**
	 * 
	 */
	private Suit suit;
	/**
	 * 
	 */
	private Value value;

	/**
	 * @return
	 */
	@SuppressWarnings("unused")
	private boolean isFaceUp() {
		//TODO
		return false; //changer false ?
	}
	
	/**
	 * @param value
	 * @param suit
	 */
	public Card(Value value, Suit suit) {
		//TODO
	}
	
	/**
	 * @return
	 */
	public Value getValue() {
		return value;
	};
	
	/**
	 * @return
	 */
	public int getNumericalValue() {
		int valeur = getNumericalValue();
		return valeur;
	}
	
	/**
	 * @return
	 */
	public Suit getSuit() {
		return suit; //changer null
	}
	
	/**
	 * 
	 */
	public void flip() {
		//TODO
	}
	
	/**
	 *
	 */
	public String toString() {
		//TODO
		return null; //changer null
	}
	
}
