package fr.Adrien1106.util.exceptions;

public class WordOutOfBoundsException extends ProtocolException {

	public WordOutOfBoundsException() {
		super("Your move is exceeding the board boundaries");
	}

	private static final long serialVersionUID = 84606001593685234L;

}
