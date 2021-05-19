package com.bloo.ioc.demo;

import com.fasterxml.jackson.databind.ser.Serializers.Base;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main ( String[] args ) {
        SpringApplication.run(DemoApplication.class, args);

        ApplicationContext context = ApplicationContextProvider.getContext();

        // 클래스 타입으로 찾기
//        Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);

//        Encoder encoder = context.getBean(Encoder.class);
        String url = "www.naver.com/books/it?page=10&size=20&name=SpringBoot";


        // 이름으로 찾기
        Encoder encoder = context.getBean("base64Encode", Encoder.class);
        String result = encoder.encode(url);
        System.out.println(result);
    }
}
