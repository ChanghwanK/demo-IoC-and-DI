import java.util.Base64;

/**
 * @CreateBy: Bloo
 * @Date: 2021/05/19
 */


public class Base64Encoder implements MyEncoder {

    @Override
    public String encode ( String message ) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
