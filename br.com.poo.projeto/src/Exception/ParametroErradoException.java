package Exception;

public class ParametroErradoException extends Exception{
    public ParametroErradoException(String message) {
        super(message);
    }
    public ParametroErradoException(Throwable t) {
        super(t);
    }
}
