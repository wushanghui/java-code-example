package base.proxy.staticproxy;

/**
 * @author jue
 * @date 2021/2/27 22:24
 * @describe
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        // 创建一个代理类
        Operate operate = new OperatorProxy();
        //代理者代替真实者做事情
        operate.sayHello();
    }
}
