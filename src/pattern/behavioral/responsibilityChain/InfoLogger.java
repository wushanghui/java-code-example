package pattern.behavioral.responsibilityChain;

public class InfoLogger extends AbstractLogger {

    public InfoLogger() {
        this.level = INFO;
        setNextLogger(new ErrorLogger());
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO::Logger: " + message);
    }
}
