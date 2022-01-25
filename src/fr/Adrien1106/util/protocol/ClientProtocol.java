package fr.Adrien1106.util.protocol;

import fr.Adrien1106.util.exceptions.NotOwnedTileException;
import fr.Adrien1106.util.exceptions.NotTurnException;
import fr.Adrien1106.util.exceptions.RoomFullException;
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
	 * Called when the player does a move
	 * @param alignment
	 * @param coordinates
	 * @param word
	 * @return if move has been accepted
	 */
	public String doMove(String alignment, String coordinates, String word) throws NotOwnedTileException, NotTurnException, WordOutOfBoundsException, UnknownTileException, WrongCoordinateException;

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
