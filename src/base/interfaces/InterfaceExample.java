package base.interfaces;

/**
 * @author wsh
 * @date 2020/7/1 19:43
 */
public interface InterfaceExample {
    void func1();

    default void func2(){
        System.out.println("func2");
    }

    int x = 123;
    // int y;               // Variable 'y' might not have been initialized
    public int z = 0;       // Modifier 'public' is redundant for interface fields
    // private int k = 0;   // Modifier 'private' not allowed here
    // protected int l = 0; // Modifier 'protected' not allowed here
    // private void fun3(); // Modifier 'private' not allowed here
}

class InterfaceImplementExample implements InterfaceExample {
    @Override
    public void func1() {
        System.out.println("func1");
    }
}

class InterfaceExampleTest {

    public static void main(String[] args) {
        InterfaceExample ie2 = new InterfaceImplementExample();
        ie2.func1();
        ie2.func2();
        System.out.println(InterfaceExample.x);
    }
}