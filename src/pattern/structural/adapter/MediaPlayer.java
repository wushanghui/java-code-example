package pattern.structural.adapter;

/**
 * 媒体播放器接口
 *
 * @author 吴尚慧
 * @since 2022/6/21 11:41
 */
public interface MediaPlayer {

    /**
     * 播放
     *
     * @param audioType 音频格式
     * @param fileName 文件名
     */
    public void play(String audioType, String fileName);
}
