package com.bloo.ioc.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @CreateBy: Bloo
 * @Date: 2021/05/19
 */


@Component
public class Encoder {
    
    private MyEncoder myEncoder;

    public Encoder ( @Qualifier("base64Encoder") MyEncoder myEncoder ) {
        this.myEncoder = myEncoder;
    }

    /**
     * bean 을 주입 받을 수 있는 대상
     * - 멤버 변수
     * - 생성자
     * - Setter
     */
    public void setMyEncoder ( MyEncoder myEncoder ) {
        this.myEncoder = myEncoder;
    }

    public String encode ( String message ) {
        return myEncoder.encode(message);
    }
}

@Configuration
class AppConfig {

    @Bean("base64Encode")
    public Encoder encoder (Base64Encoder base64Encoder) {
        return new Encoder(base64Encoder);
    }

    @Bean("urlEncode")
    public Encoder encoder (UrlEncoder urlEncoder) {
        return new Encoder(urlEncoder);
    }
}
