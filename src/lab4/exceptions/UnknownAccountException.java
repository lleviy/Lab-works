package lab4.exceptions;

public class UnknownAccountException extends Exception {
    public UnknownAccountException(String errorMessage) {
        super(errorMessage);
    }
}
