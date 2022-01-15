package fr.Adrien1106.util.protocol;

/**
 * Protocol messages for networked scrabble
 * @author Adrien1106
 */
public class ProtocolMessages {

	/**
	 * Delimiter used to separate arguments sent over the network.
	 */
	public static final String DELIMITER = ";";

	/**
	 * Sent as last line in a multi-line response to indicate the end of the text.
	 */
	public static final String EOT = "--EOT--";

	/**
	 * The following Strings are both used by the TUI to receive user input, and the
	 * server and client to distinguish messages.
	 */
	
	/** <b> Usage:</b> "c;[player_name]", <b> Example:</b> "c;PlayerA" */
	public static final String CONNECT = "c";
	
	/** <b> Usage:</b> "cc" */
	public static final String CONFIRM_CONNECTION = "cc";
	
	/** <b> Usage:</b> "jr;[room_id]", <b> Example:</b> "jr;101" */
	public static final String JOIN_ROOM = "jr";
	
	/** <b> Usage:</b> "cr;[number_player]", <b> Example:</b> "cr;2" */
	public static final String CREATE_ROOM = "cr";
	
	/** <b> Usage:</b> "ig;[table];[player_name#player_number],[player_name#player_number],...", <b> Example:</b> "ig; , ,t, \n , ,e, \nt,e,s,t\n , ,t, ;PlayerA#1,PlayerB#2" */
	public static final String INITIATE_GAME = "ig";
	
	/** <b> Usage:</b> "rp;[player_name#player_number]", <b> Example:</b> "rp;PlayerC#3" */
	public static final String ADD_OR_REMOVE_PLAYER = "rp";
	
	/** <b> Usage:</b> "m;[alignment];[coordinates],[word]", <b> Example:</b> "m;horizontal;A,2;wood" */
	public static final String MAKE_MOVE = "m";

	/** <b> Usage:</b> "s"*/
	public static final String SKIP_TURN = "s";

	/** <b> Usage:</b> "f;[accepted]", <b> Example:</b> "f;true" */
	public static final String FEEDBACK = "f";

	/** <b> Usage:</b> "ut;[table]", <b> Example:</b> "ut; , ,t, \n , ,e, \nt,e,s,t\n , ,t, " */
	public static final String UPDATE_TABLE = "ut";

	/** <b> Usage:</b> "us;[player_name#player_number];[score]", <b> Example:</b> "us;PlayerC#3;10" */
	public static final String UPDATE_SCORE = "us";

	/** <b> Usage:</b> "r;[tile][tile]", <b> Example:</b> "r;ABC" */
	public static final String REPLACE_TILES = "r";

	/** <b> Usage:</b> "gt;[tile][tile]", <b> Example:</b> "gt;ABC" */
	public static final String GIVE_TILE = "gt";

	/** <b> Usage:</b> "x;[player_name#player_number];[score]", <b> Example:</b> "x;PlayerC#3;10" */
	public static final String FINISH_GAME = "x";

	/** <b> Usage:</b> "d" */
	public static final String DISCONNECT = "d";
	
	/**
	 * Special commands for custom method implementations
	 * <u><b> Keep in mind the game should be able to run without theses </b></u>
	 */
	public static final String CUSTOM_COMMAND = "/";
	public static final String CUSTOM_EXCEPTION = "!";

}
