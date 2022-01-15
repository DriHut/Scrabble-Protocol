package fr.Adrien1106.util.protocol;

import fr.Adrien1106.util.exceptions.NotOwnedTileException;
import fr.Adrien1106.util.exceptions.NotTurnException;
import fr.Adrien1106.util.exceptions.RoomFullException;
import fr.Adrien1106.util.exceptions.ServerUnavailableException;
import fr.Adrien1106.util.exceptions.TooFewPlayersException;
import fr.Adrien1106.util.exceptions.TooManyPlayersException;
import fr.Adrien1106.util.exceptions.UnknownRoomException;
import fr.Adrien1106.util.exceptions.UnknownTileException;
import fr.Adrien1106.util.exceptions.WordOutOfBoundsException;
import fr.Adrien1106.util.exceptions.WrongCoordinateException;

/**
 * Defines the methods that the scrabble Client should support.
 * @author Adrien1106
 */
public interface ClientProtocol {

	/**
	 * Handles a connection confirmation
	 * @throws ServerUnavailableException if IO errors occur.
	 */
	public void handleConnect() throws ServerUnavailableException;
	

	/**
	 * Called when the player join a room
	 * @param room_id
	 * @return an initialization of the room (table, players that are already in the game);
	 */
	public String doJoinRoom(String room_id) throws UnknownRoomException, RoomFullException;
	
	/**
	 * Called when a new room is being created
	 * @return a room id that the person just created
	 */
	public String doCreateRoom(String player_number) throws TooManyPlayersException, TooFewPlayersException;
	
	/**
	 * Called when joining a room
	 * @param table - the table sent by the server
	 * @param players - the players that are part of the room
	 * @return
	 */
	public void doInitiateGame(String table, String players);

	/**
	 * Called when a player join or leave the server
	 * @param player - player added (name#number)
	 */
	public void doAddOrRemovePlayer(String player);
	
	/**
	 * Called when the player does a move
	 * @param alignment
	 * @param coordinates
	 * @param word
	 * @return if move has been accepted
	 */
	public String doMove(String alignment, String coordinates, String word) throws NotOwnedTileException, NotTurnException, WordOutOfBoundsException, UnknownTileException, WrongCoordinateException;
	
	
	/**
	 * Called after each actions that needs to be checked by the server
	 * @param accepted - boolean sent as a feedback by the server
	 */
	public void handleFeeback(String accepted);
	
	/**
	 * Called when an update of the table is sent by the server
	 * @param table - the table sent by the server
	 */
	public void handleTableUpdate(String table);
	
	/**
	 * Called when the score of a player is being updated
	 * @param player - player for which the score is being updated (name#number)
	 * @param score - the new score to apply to the given player
	 */
	public void handleScoreUpdate(String player, String score);
	
	/**
	 * Called when the server sends tiles to the player
	 * @param tiles - string of tiles ("ABC" for 3 tiles)
	 */
	public void handleRecievingTiles(String tiles);
	
	/**
	 * Called when the game is finished
	 * @param player - player(s) that won the game
	 * @param score - score(s) of the player(s)
	 */
	public void handleFinishGame(String player, String score);
	
	/**
	 * Called when a player want to skip his turn
	 * @return if skipping is accepted
	 */
	public String doSkip();
	
	/**
	 * Called when a player want to replace some tiles
	 * @param tiles - tiles to be replaced
	 * @return new tiles to be sent to the client
	 */
	public String doReplaceTiles(String tiles) throws UnknownTileException;
	
	/**
	 * Called when a player disconnects from the server
	 */
	public void doDisconnect();
}
