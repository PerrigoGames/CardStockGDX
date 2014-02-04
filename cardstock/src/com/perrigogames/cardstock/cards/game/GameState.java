package com.perrigogames.cardstock.cards.game;

/*import com.perrigogames.cardstock.cards.Deck;
import com.perrigogames.cardstock.cards.graphics.ButtonZone;
import com.perrigogames.cardstock.cards.graphics.ZoneManager;

import android.util.Log;

public abstract class GameState {
	private static final String TAG = GameState.class.getSimpleName();
	
	public static enum State { 
		StartTurn, MainPhase, PlayCardResponse, PlayCardEffect, 
		ExploreInitial, ExploreWeapons, ExploreRespond, ExploreReveal, ExploreAgain, ExploreDamage, ExploreEnd, 
		PlayerInput, EndTurn };
	private State currentState;
	public State currentState() { return currentState; }
	
	private Game game;
	private ZoneManager zones;
	
	public GameState(Game parent, State initialState) {
		this.game = parent;
		setState(initialState, true);
		zones = ZoneManager.getZoneManager();
	}
	
	public void setState(State newState, boolean useChangeEffects) {
		Log.d(TAG, String.format("Game state changed: player %d, %s", game.activePlayer(), newState));
		currentState = newState;
		onStateChange();
	}
	
	protected abstract void onStateChange();
	
	
	private State previousState;
	private PlayerInputState playerState;
	public PlayerInputState playerState() { return playerState; }
	
	//	enters into a new PlayerInput state
	public void startPlayerInput(PlayerInputState inputState) {
		//	if the input is legitimate, put the game state to PlayerInput, then start the custom game state
		if (inputState != null) {
			this.previousState = currentState;
			this.setState(State.PlayerInput, false);
			this.playerState = inputState;
			this.playerState.onPlayerInputStart();
		} else Log.e(TAG, "Error: PlayerInput state is null, no state to enter");
	}
	
	//	exits the currently active PlayerInput state
	public void endPlayerInput() {
		if (this.playerState == null) {
			Log.e(TAG, "Error: PlayerInput state is null, no state to exit from");
			return;
		}
		this.playerState.onPlayerInputFinish();
		this.setState(previousState, false);
		this.playerState = null;
	}
	
	//	the abstract class for PlayerInputState
	//	contains methods meant to be called by a specific
	public static abstract class PlayerInputState {
		protected String gameStateMessage;
		protected Game game;
		protected Player actingPlayer;
		protected ButtonZone actionButton;
		
		public PlayerInputState (Game game, Player actingPlayer) {
			this.game = game;
			this.actingPlayer = actingPlayer;
			this.actionButton = (ButtonZone) ZoneManager.getZoneManager().getZone("action_button");
		}
		public abstract void onPlayerInputStart();
		public abstract boolean isSelectable(Deck source, int index);
		public abstract void onCardSelected(Deck source, int index);
		public abstract void onExtraButtonPressed();
		public abstract void onPlayerInputFinish();
		public String getStateMessage() { return gameStateMessage; }
	}
}
*/