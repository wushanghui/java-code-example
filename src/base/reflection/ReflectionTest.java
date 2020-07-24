package base.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wsh
 * @date 2019/11/15 15:23
 * 反射测试-打印类中所有的方法和构造器的签名，以及全部域名
 */
public class ReflectionTest {

    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("输入全类名：eg：java.lang.Double");
            name = in.next();
        }

        try {
            Class<?> cl = Class.forName(name);
            Class<?> superCl = cl.getSuperclass();
            //cl.getModifiers() 整型数据值，用不同的开关位描述public和static这样的修饰符使用情况
            //Modifier.toString() 将修饰符打印出来
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) {
                System.out.println(modifiers + " ");
            }
            System.out.print("class " + name);
            if (superCl != null && superCl != Object.class) {
                System.out.print(" extends " + superCl.getName());
            }
            System.out.print(" {\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);

    }

    /**
     * 构造器打印
     * @param cl class
     */
    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();
        Arrays.stream(constructors).forEach(c -> {
            System.out.print("    ");
            String name = c.getName();
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                //打印修饰符
                System.out.print(modifiers + " ");
            }
            //打印构造器名称
            System.out.print(name + "(");
            //打印参数类型
            Class[] parameterTypes = c.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(parameterTypes[i].getName());
            }
            System.out.println(");");
        });
    }

    /**
     * 打印方法
     * @param cl class
     */
    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        Arrays.stream(methods).forEach(m -> {
            Class<?> returnType = m.getReturnType();
            String name = m.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(returnType.getName() + " " + name + "(");
            Class<?>[] parameterTypes = m.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(parameterTypes[i].getName());
            }
            System.out.println(");");
        });
    }

    /**
     * 打印实例域
     * @param cl class
     */
    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();
        Arrays.stream(fields).forEach(f -> {
            Class<?> type = f.getType();
            String name = f.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        });
    }
}
