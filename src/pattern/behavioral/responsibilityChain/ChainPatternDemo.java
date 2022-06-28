package pattern.behavioral.responsibilityChain;

public class ChainPatternDemo {


    public static void main(String[] args) {
        System.out.println("error 日志级别，只会打印error的日志：");
        AbstractLogger errorLogger = new ErrorLogger();
        errorLogger.logMessage(AbstractLogger.DEBUG, "debug log");
        errorLogger.logMessage(AbstractLogger.INFO, "info log");
        errorLogger.logMessage(AbstractLogger.ERROR, "error log");

        System.out.println("----------------------");

        System.out.println("info 日志级别，会打印info、error的日志：");
        AbstractLogger consoleLogger = new InfoLogger();
        consoleLogger.logMessage(AbstractLogger.DEBUG, "debug log");
        consoleLogger.logMessage(AbstractLogger.INFO, "info log");
        consoleLogger.logMessage(AbstractLogger.ERROR, "error log");

        System.out.println("----------------------");
        System.out.println("debug 日志级别，会打印debug、info、error的日志：");
        AbstractLogger fileLogger = new DebugLogger();
        fileLogger.logMessage(AbstractLogger.DEBUG, "debug log");
        fileLogger.logMessage(AbstractLogger.INFO, "info log");
        fileLogger.logMessage(AbstractLogger.ERROR, "error log");

    }
}
