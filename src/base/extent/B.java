package base.extent;

/**
 * @author 吴尚慧
 * @since 2022/5/3 10:47 上午
 */
public class B implements A {

    private String language;

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public void setLanguage(String language) {
        this.language = language;
    }

    public static void main(String[] args) {
        B b = new B();
        b.setLanguage("111");
        A a = (A)b;
        System.out.println(a.getLanguage());
    }
}
