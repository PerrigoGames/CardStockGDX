package com.perrigogames.cardstock.cards;

import java.util.ArrayList;
import java.util.Random;

/** A structure to track a series of cards in a stack with an adjustable face-up/face-down quality.
 *  
 *  This structure assumes that index 0 corresponds to the top of the face-up deck.
 *  If the deck is face-down, the top of the deck is at index size() - 1
 *  The "front" of the deck is always index 0, regardless of face-up/face-down
 *  
 * @author Corey */
public class Deck extends ArrayList<Card> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -532440718405918260L;
	
	/**	This structure assumes that index 0 corresponds to the top of the face-up deck.
	 *  If the deck is face-down, the top of the deck is at index size() - 1
	 *  The "front" of the deck is always index 0, regardless of face-up/face-down
	 */
	
	protected boolean faceUp;				//	variable that designates whether or not the deck is face up or face down
	
	/** Constructs a new empty Deck object */
	public Deck () {
		super();
		faceUp = true;
	}
	
	/** Constructs a new Deck object as a copy of another Deck */
	public Deck(Deck other) {
		super(other);
		faceUp = other.faceUp;
	}
	
	public boolean equals(Object other) {
		Deck otherDeck;
		try {
			otherDeck = (Deck)other;
		} catch (ClassCastException e) {
			return false;
		}
		if (this.size() != otherDeck.size()) return false;
		
		return super.equals(otherDeck);
	}
	
	public boolean isFaceUp() {
		return faceUp;
	}
	
	public void setFaceUp(boolean faceUp) {
		this.faceUp = faceUp;
	}
	
	/** Toggles this {@link Deck}'s faceUp field */
	public void flipDeck() {
		faceUp = !faceUp;
	}
	
	public int top() {
		return faceUp ? 0 : size() - 1;
	}
	
	/**
	 * @return the index for the bottom card in this {@link Deck}, taking into account the faceUp state of the deck
	 */
	public int bottom() {
		return faceUp ? size() - 1 : 0;
	}
}
