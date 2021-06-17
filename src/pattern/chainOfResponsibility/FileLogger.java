package pattern.chainOfResponsibility;

public class FileLogger extends AbstractLogger {

    public FileLogger() {
        this.level = DEBUG;
        setNextLogger(new ConsoleLogger());
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
