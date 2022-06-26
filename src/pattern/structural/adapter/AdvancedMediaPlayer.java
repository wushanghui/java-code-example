package pattern.structural.adapter;

/**
 * 高级媒体播放器接口
 *
 * @author 吴尚慧
 * @since 2022/6/21 11:43
 */
public interface AdvancedMediaPlayer {

    public void playVlc(String fileName);

    public void playMp4(String fileName);
}
