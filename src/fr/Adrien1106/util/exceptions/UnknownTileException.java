package fr.Adrien1106.util.exceptions;

public class UnknownTileException extends ProtocolException {

	public UnknownTileException(String tile) {
		super("Tile \"" + tile + "\" is unknown");
	}

	private static final long serialVersionUID = -8020561333174075025L;

}
