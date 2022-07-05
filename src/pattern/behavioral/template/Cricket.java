package pattern.behavioral.template;

/**
 * 板球
 *
 * @author 吴尚慧
 * @since 2022/7/5 17:17
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("板球比赛结束！");
    }

    @Override
    void initialize() {
        System.out.println("板球比赛已初始化！开始播放。");
    }

    @Override
    void startPlay() {
        System.out.println("板球比赛开始。玩的开心！");
    }
}
