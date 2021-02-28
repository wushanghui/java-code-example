package base.proxy.staticproxy;

/**
 * @author jue
 * @date 2021/2/27 22:23
 * @describe
 */
public class OperatorProxy implements Operate{

    private OperateImpl operateImpl = null;

    @Override
    public void sayHello() {
        beforeSayHello();
        if(operateImpl == null){
            operateImpl =  new OperateImpl();
        }
        operateImpl.sayHello();
        afterSayHello();
    }

    private void beforeSayHello() {
        System.out.println("before sayHello");
    }

    private void afterSayHello() {
        System.out.println("after sayHello");
    }
}
