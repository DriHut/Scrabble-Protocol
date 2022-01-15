package fr.Adrien1106.util.exceptions;

public class NotOwnedTileException extends ProtocolException {

	public NotOwnedTileException(String tile) {
		super("You are not owner of all this tile: " + tile);
	}

	private static final long serialVersionUID = 7617379268202609185L;

}
