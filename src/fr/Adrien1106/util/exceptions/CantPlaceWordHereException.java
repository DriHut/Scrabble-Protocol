package fr.Adrien1106.util.exceptions;

public class CantPlaceWordHereException extends ProtocolException {

	private static final long serialVersionUID = -6430073858160677775L;
	
	public CantPlaceWordHereException() {
		super("EO16","the placing of the word hasn't been authorised");
	}

}
