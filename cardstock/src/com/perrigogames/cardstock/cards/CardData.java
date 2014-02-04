package com.perrigogames.cardstock.cards;

import java.util.HashMap;

import com.badlogic.gdx.Gdx;

public class CardData extends HashMap<Integer, Card> {
	private static final long serialVersionUID = -4023690895070976922L;
	public static final String TAG = CardData.class.getSimpleName();
	
	private static CardData cardData = null;
	
	//	constructs a new CardData
	//	since CardData is a singleton, instantiate the CardData using initCardData
	private CardData() {
		super();
		Gdx.app.log(TAG, "CardData instantiated");
	}
	
	//	instantiates a new CardData if one doesn't exist
	//	otherwise, returns the instance that already exists
	public static CardData initCardData() {
		if (cardData == null)  cardData = new CardData();
		else Gdx.app.error(TAG, "CardData already instantiated!");
		return cardData;
	}
	
	//	returns the instance of the CardData that already exists (even if there is none)
	public static CardData getCardData() {
		return cardData;
	}
	
	//	returns true if there is a CardData object, false otherwise
	public static boolean exists() {
		return cardData != null;
	}
	
	//	sets the stored CardData to null
	public static void destroy() {
		cardData = null;
	}
}
