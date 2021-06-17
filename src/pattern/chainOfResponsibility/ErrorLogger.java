package pattern.chainOfResponsibility;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger() {
        this.level = ERROR;
        setNextLogger(null);
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}