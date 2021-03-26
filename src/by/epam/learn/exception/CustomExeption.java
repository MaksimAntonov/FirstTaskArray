package by.epam.learn.exception;

public class CustomExeption extends Exception {
    private static final long serialVersionUID = 1L;

    public CustomExeption() {
        super();
    }

    public CustomExeption(String message) {
        super(message);
    }

    public CustomExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomExeption(Throwable cause) {
        super(cause);
    }
}
