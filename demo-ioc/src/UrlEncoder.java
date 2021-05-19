import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @CreateBy: Bloo
 * @Date: 2021/05/19
 */
public class UrlEncoder implements MyEncoder {

    @Override
    public String encode ( String message ) {
        try {
            return URLEncoder.encode(message, "UTF-8");
        } catch ( UnsupportedEncodingException e ) {
            e.printStackTrace();
            return null;
        }
    }
}
