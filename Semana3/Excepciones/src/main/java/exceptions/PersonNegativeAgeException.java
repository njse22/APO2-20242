package exceptions;

public class PersonNegativeAgeException extends Exception {

    public PersonNegativeAgeException(String message) {
        super(message);
    }
}
