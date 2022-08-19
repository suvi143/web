package Exception;

public class priceNotFound extends Exception {
	public priceNotFound(String word) {				// constructor create
		super(word);							// that why we use super key word// i call parent class constructor
	}
}
