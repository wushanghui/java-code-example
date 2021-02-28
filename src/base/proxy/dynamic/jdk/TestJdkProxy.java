package base.proxy.dynamic.jdk;

/**
 * @author jue
 * @date 2021/2/28 16:50
 * @describe
 */
public class TestJdkProxy {

    public static void main(String[] args) {
        JdkProxy jdk = new JdkProxy();
        Operate proxy = (Operate) jdk.bind(new OperateImpl());
        proxy.sayHello();
    }
}
