package pattern.structural.adapter;

/**
 * Mp4 播放器
 *
 * @author 吴尚慧
 * @since 2022/6/21 11:44
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}