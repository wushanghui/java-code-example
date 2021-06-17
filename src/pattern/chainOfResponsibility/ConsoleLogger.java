package pattern.chainOfResponsibility;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger() {
        this.level = INFO;
        setNextLogger(new ErrorLogger());
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
