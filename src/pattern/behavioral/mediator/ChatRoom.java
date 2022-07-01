package pattern.behavioral.mediator;

import java.time.LocalDateTime;

/**
 * 聊天室
 *
 * @author 吴尚慧
 * @since 2022/6/30 16:17
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(LocalDateTime.now().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
