package base.input;

import org.junit.Test;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author wsh
 * @date 2020/7/9 17:55
 */
public class InputTest {

    @Test
    public void test1() throws IOException {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        input.close();

    }
}
