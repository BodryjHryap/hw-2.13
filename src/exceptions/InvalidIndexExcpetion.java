package exceptions;

public class InvalidIndexExcpetion extends RuntimeException {
    public InvalidIndexExcpetion() {
    }

    public InvalidIndexExcpetion(String message) {
        super(message);
    }

    public InvalidIndexExcpetion(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIndexExcpetion(Throwable cause) {
        super(cause);
    }

    public InvalidIndexExcpetion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
