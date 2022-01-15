package fr.Adrien1106.util.protocol;

/**
 * Defines the methods that the scrabble Client should support.
 * @author Adrien1106
 */
public interface ClientProtocol {

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
}
