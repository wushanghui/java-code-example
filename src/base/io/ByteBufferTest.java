package base.io;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/**
 * @author 吴尚慧
 * @since 2021/12/15 22:55
 */
public class ByteBufferTest {

    public static void main(String[] args) {
        String str = "CDCD";
        ByteBuffer buffer = ByteBuffer.wrap(str.getBytes(StandardCharsets.UTF_8));
        System.out.println("buffer.limit(): " +buffer.limit());
        System.out.println(Integer.toHexString(buffer.getShort()));
    }
}
