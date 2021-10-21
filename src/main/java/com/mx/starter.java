package com.mx;

import com.mx.config.IocConfig;
import com.mx.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class starter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(IocConfig.class);
        UserService userService = ac.getBean(UserService.class);
        userService.test();
    }
}
