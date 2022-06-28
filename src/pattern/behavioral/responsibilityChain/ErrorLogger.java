package pattern.behavioral.responsibilityChain;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger() {
        this.level = ERROR;
        setNextLogger(null);
    }

    @Override
    protected void write(String message) {
        System.out.println("Error::Logger: " + message);
    }
}