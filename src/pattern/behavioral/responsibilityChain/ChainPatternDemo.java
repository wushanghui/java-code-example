package pattern.behavioral.responsibilityChain;

/**
 * 责任链模式
 * 顾名思义，责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。
 *
 */
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
