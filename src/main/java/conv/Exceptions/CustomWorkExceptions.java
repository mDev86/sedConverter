package conv.Exceptions;

public class CustomWorkExceptions extends Exception {
    public CustomWorkExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomWorkExceptions(String message) {
        super(message);
    }
}
