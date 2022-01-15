package fr.Adrien1106.util.exceptions;

public class WrongCoordinateException extends ProtocolException {

	public WrongCoordinateException(String coordinate) {
		super("Cordinate \"" + coordinate + "\" doesn't fit or match with anything");
	}

	private static final long serialVersionUID = 6988900144002756968L;

}
