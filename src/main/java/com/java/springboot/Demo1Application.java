package com.java.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        //容器的初始化操作   springboot启动会调用spring的初始化操作
        //ApplicationContext ac = new AnnotationConfigApplicationContext(Demo1Application.class);
        //通过run方法的跟踪 看到了刷新容器的方法
        ConfigurableApplicationContext run = SpringApplication.run(Demo1Application.class, args);
    }

}
