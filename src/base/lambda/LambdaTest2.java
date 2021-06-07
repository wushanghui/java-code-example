package base.lambda;


import javax.swing.*;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @author wsh
 * @date 2019/11/21 18:08
 */
public class LambdaTest2 {

    public static void main(String[] args) {
        myClass myClass = new myClass();

        String trimStr = myClass.strHandler("我是一个字符串", (str) -> str+"：suffix");
        System.out.println(trimStr);
    }
}



class myClass {

    /**
     * 处理字符串
     * @param str
     * @param mf
     * @return
     */
    public String strHandler(String str, MyFunction mf){//函数式接口MyFunction
        return mf.getValue("prefix: "+str);
    }
}