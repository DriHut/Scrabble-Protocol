package fr.Adrien1106.util.exceptions;

public class UnknownRoomException extends ProtocolException {

	public UnknownRoomException(int room) {
		super("E002","There is no room \"" + room + "\"");
	}

	private static final long serialVersionUID = 1806841108620734671L;
}
