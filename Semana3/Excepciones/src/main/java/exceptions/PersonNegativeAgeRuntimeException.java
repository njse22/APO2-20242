package exceptions;

public class PersonNegativeAgeRuntimeException extends RuntimeException {

    public PersonNegativeAgeRuntimeException(String message) {
        super(message);
    }
}
