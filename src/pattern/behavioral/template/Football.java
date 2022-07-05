package pattern.behavioral.template;

/**
 * @author 吴尚慧
 * @since 2022/7/5 17:19
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("足球比赛结束！");
    }

    @Override
    void initialize() {
        System.out.println("足球比赛初始化！开始播放。");
    }

    @Override
    void startPlay() {
        System.out.println("足球比赛开始。玩的开心！");
    }
}
