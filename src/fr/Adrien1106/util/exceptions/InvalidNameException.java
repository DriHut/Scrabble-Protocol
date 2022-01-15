package fr.Adrien1106.util.exceptions;

public class InvalidNameException extends ProtocolException {

	public InvalidNameException(String name) {
		super(name + "is an invalid name");
	}

	private static final long serialVersionUID = 8139762022753344380L;

}
