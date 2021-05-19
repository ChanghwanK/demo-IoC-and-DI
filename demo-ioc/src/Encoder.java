import java.util.Base64;

/**
 * @CreateBy: Bloo
 * @Date: 2021/05/19
 */


public class Encoder {
    
    private MyEncoder myEncoder;

    public Encoder ( MyEncoder myEncoder ) {
        this.myEncoder = myEncoder;
    }

    public String encode ( String message ) {
        return myEncoder.encode(message);
    }
}
