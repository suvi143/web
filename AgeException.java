package Exception;

public class AgeException extends Exception {
	public AgeException(String age) {				// constructor create
		super(age);							// that why we use super key word// i call parent class constructor
	}
	public void printStackTrace() {
		System.err.println("Not Yet");
	}
}
