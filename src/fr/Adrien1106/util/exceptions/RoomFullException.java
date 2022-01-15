package fr.Adrien1106.util.exceptions;

public class RoomFullException extends ProtocolException {

	public RoomFullException(int room) {
		super("Room \"" + room + "\" is full");
	}

	private static final long serialVersionUID = -8445168959281065260L;
}
