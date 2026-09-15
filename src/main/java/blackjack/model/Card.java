package blackjack.model;

import blackjack.model.Deck;
import blackjack.model.Suit;
import blackjack.model.Value;

@SuppressWarnings("unused")
public class Card {
	
	private Suit suit;
	private Value value;

	@SuppressWarnings("unused")
	private boolean isFaceUp() {
		//TODO
		return false; //changer false ?
	}
	
	public Card(Value value, Suit suit) {
		//TODO
	}
	
	public Value getValue() {
		return value;
	};
	
	public int getNumericalValue() {
		int valeur = getNumericalValue();
		return valeur;
	}
	
	public Suit getSuit() {
		return suit; //changer null
	}
	
	public void flip() {
		//TODO
	}
	
	public String toString() {
		//TODO
		return null; //changer null
	}
	
}
