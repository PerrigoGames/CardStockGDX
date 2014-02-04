package com.perrigogames.cardstock.cards.game;

/*import com.perrigogames.cardstock.cards.game.GameState.State;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

public abstract class Game {
	public static final boolean DEBUG_MODE = true;
	
	protected Context context;
	public Context getContext() { return context; }
	
	protected static Game game;
	public String gameStateMessage;
	
	protected int numPlayers;
	protected Player[] players;
	public Player[] players() { return players; }
	public Player getPlayer(int index) { return players[index]; }
	
	protected int activePlayer = 0;	//	the player currently taking a turn
	protected int visiblePlayer = 0;	//	the player who's hand is showing
	protected int tempPlayer = 0;		//	a temporary counter for when other players need to be tested in order, but are not actually taking a turn
	public int activePlayer() { return activePlayer; }
	public int visiblePlayer() { return visiblePlayer; }
	public int tempPlayer() { return tempPlayer; }
	public Player getActivePlayer() { return players[activePlayer]; }
	public Player getVisiblePlayer() { return players[visiblePlayer]; }
	public Player getTempPlayer() { return players[tempPlayer]; }
	
	public int playerBefore(int compare) { 
		int temp = compare - 1;
		if (temp < 0) temp = numPlayers - 1;
		return temp;
	}
	public int playerAfter(int compare) { 
		int temp = compare + 1;
		if (temp >= numPlayers) temp = 0;
		return temp;
	}
	
	private GameState state;
	public GameState state() { return state; }
	
	public boolean gameConcluded;
	
	protected int gameTurn;
	public int gameTurn() { return gameTurn; }
	
	protected Game(Context context, int numPlayers) {
		this.context = context;
		
		//	set the game state to StartTurn
		//state = new GameState(this, State.StartTurn);
		
		//	set game turn to 1
		gameTurn = 1;
		gameConcluded = false;
	}
	
	//	instantiates a new Game if one doesn't exist
	//	otherwise, returns the instance that already exists
	public static Game startGame(Context context, int numPlayers) {
		return null;
	}
	
	public static Game startGame(Context context, int numPlayers) {
		if (game == null)  game = new Game(context, numPlayers);
		else  Log.e(TAG, "Game already instantiated!");
		return game;
	}
	
	
	//	returns the currently instantiated Game object, even if it is null
	public static Game getGame() {
		return game;
	}
	
	//	returns true if there is a Game object, false otherwise
	public static boolean exists() {
		return game != null;
	}
	
	//	sets the context of this Game object, in case the original context is missing
	public void setContext(Context context) {
		this.context = context;
	}
	
	//	sets the stored Game to null
	public static void destroy() {
		game = null;
	}
	
	//	checks whether it's the current player's turn
	public boolean isActivePlayer(Player play) {
		return play.playerId() == activePlayer;
	}
	
	//	checks whether the specified player is set as temp
	public boolean isTempPlayer(Player play) {
		return play.playerId() == tempPlayer;
	}
	
	//	advances the active player to the next player
	public void advanceActivePlayer() {
		activePlayer++;
		if (activePlayer == numPlayers) {
			activePlayer = 0;
			gameTurn++;
		}
		tempPlayer = activePlayer;
		
		//	recursively call if the newly selected player has been eliminated
		if (numPlayersRemaining() > 0 && getActivePlayer().isEliminated) advanceActivePlayer();
	}
	
	//	advances the temp player to the next player
	//	returns true if the counter is back to the active player (where it started)
	public boolean advanceTempPlayer() {
		tempPlayer++;
		if (tempPlayer == numPlayers) tempPlayer = 0;
		
		//	recursively call if the newly selected player has been eliminated
		if (numPlayersRemaining() > 0 && getTempPlayer().isEliminated) return advanceTempPlayer();
		else return tempPlayer == activePlayer;
	}
	
	//	counts the number of players playing that haven't yet been eliminated
	public int numPlayersRemaining() {
		int remain = 0;
		for (Player p : players) if (!p.isEliminated) remain++;
		return remain;
	}
	
	
	///
	///		Misc. Methods
	///
	
	//	updates the gameStateMessage field depending on which phase the GameState is in
	public abstract void update();
	
	public void popupToast(String text) {
		Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
		toast.show();
	}
	
	public void popupMessage(String title, String message) {
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setTitle(title)
			   .setMessage(message)
			   .setNeutralButton("Okay", new DialogInterface.OnClickListener() {
				   public void onClick(DialogInterface dialog, int id) {
					   dialog.dismiss();
				   }
			   });
		AlertDialog alert = builder.create();
		alert.show();
	}
}
*/