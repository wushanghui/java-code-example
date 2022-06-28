package pattern.behavioral.responsibilityChain;

public class DebugLogger extends AbstractLogger {

    public DebugLogger() {
        this.level = DEBUG;
        setNextLogger(new InfoLogger());
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG::Logger: " + message);
    }
}
