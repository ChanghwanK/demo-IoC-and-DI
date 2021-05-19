/**
 *
 * Spring DI 실습
 *  - 구현 요구 사항: Encoding 지원해라
 *
 * @CreateBy: Bloo
 * @Date: 2021/05/19
 *
 */
public class Main {
    public static void main ( String[] args ) {
        String url = "www.naver.com/books/it?page=10&size=20&name=SpringBoot";


        // Base 64 Encoding
        Encoder base64Encoder = new Encoder(new Base64Encoder());
        String result = base64Encoder.encode(url);
        System.out.println(result);


        // URL Encoding
        Encoder urlEncoder = new Encoder(new UrlEncoder());
        String urlEncodingResult = urlEncoder.encode(url);
        System.out.println(urlEncodingResult);
    }
}
