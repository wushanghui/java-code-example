package base.boxingandunboxing;

/**
 * @author wsh
 * @date 2020/7/9 14:07
 */
public class BoxTest {

    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;

        System.out.println(c==d);// true
        System.out.println(e==f);// false
        System.out.println(c==(a+b));// true
        System.out.println(c.equals(a+b));// true
        System.out.println(g==(a+b));// true
        System.out.println(g.equals(a+b));// false
        System.out.println(g.equals(a+h));// true

        System.out.println("------------------------------------");
        Integer i1 = 40;
        Integer i2 = 40;
        Integer i3 = 0;
        Integer i4 = new Integer(40);
        Integer i5 = new Integer(40);
        Integer i6 = new Integer(0);

        System.out.println("i1=i2   " + (i1 == i2));
        System.out.println("i1=i2+i3   " + (i1 == i2 + i3));
        System.out.println("i1=i4   " + (i1 == i4));
        System.out.println("i4=i5   " + (i4 == i5));
        System.out.println("i4=i5+i6   " + (i4 == i5 + i6));
        System.out.println("40=i5+i6   " + (40 == i5 + i6));

    }
}
