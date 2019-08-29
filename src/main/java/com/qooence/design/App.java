package com.qooence.design;

import com.qooence.design.config.MyConfig;
import com.qooence.design.service.PrizeSenderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("启动成功...");
        PrizeSenderService service = context.getBean(PrizeSenderService.class);
        service.mockedClient_normal();

        service.mockedClient_builder();
    }
}
