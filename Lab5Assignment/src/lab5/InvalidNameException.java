package lab5;

public class InvalidNameException extends Exception {
	public InvalidNameException() {
		super();
	}

	public InvalidNameException(String msg) {
		super(msg);
	}
}