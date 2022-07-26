package base.extent;

/**
 * @author 吴尚慧
 * @since 2022/5/3 10:46 上午
 */
public interface A {

    default String getLanguage() {
        return "";
    }

    default void setLanguage(String language) {

    }
}
