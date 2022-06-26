package pattern.structural.adapter;

/**
 * Vlc 播放器
 *
 * @author 吴尚慧
 * @since 2022/6/21 11:44
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
