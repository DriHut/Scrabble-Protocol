package fr.Adrien1106.util.exceptions;

public class NotTurnException extends ProtocolException {

	public NotTurnException() {
		super("It isn't you turn yet");
	}

	private static final long serialVersionUID = 2135295342394912372L;

}
