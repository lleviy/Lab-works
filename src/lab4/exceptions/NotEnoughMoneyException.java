package lab4.exceptions;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String errorMessage) {
        super(errorMessage);
    }
}
