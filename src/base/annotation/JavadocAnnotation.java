package base.annotation;

/**
 * @author wushanghui
 * @date 2020/7/16 17:51
 * @see Math
 * @version	 1.0
 *
 */
public class JavadocAnnotation {

    /**
     * 程序的主方法，程序的入口
     *
     * @param args String[] 命令行参数
     */
    public static void main(String[] args) {
        System.out.println(getArea(1.0d)); // 3.141592653589793
    }


    /**
     * 求圆面积的方法
     * @since 1.0
     * @param radius double 半径值
     * @return double 圆的面积
     */
    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }
}
