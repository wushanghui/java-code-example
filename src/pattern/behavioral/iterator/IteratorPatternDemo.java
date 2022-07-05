package pattern.behavioral.iterator;

/**
 * 迭代器模式
 *
 * @author 吴尚慧
 * @since 2022/6/30 11:28
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }

    }
}
