package pattern.behavioral.template;

/**
 * 模板模式
 *
 * @author 吴尚慧
 * @since 2022/7/5 17:20
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
