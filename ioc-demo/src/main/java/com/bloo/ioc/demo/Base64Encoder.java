package com.bloo.ioc.demo;

import java.util.Base64;
import org.springframework.stereotype.Component;


/**
 * @CreateBy: Bloo
 * @Date: 2021/05/19
 */

@Component("base64Encoder")
public class Base64Encoder implements MyEncoder {

    @Override
    public String encode ( String message ) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
