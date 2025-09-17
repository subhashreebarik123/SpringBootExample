package com.SpringBootExample.ApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
    class MyService {
        public void serve() {
            System.out.println("Service is running...");
        }
    }


    @ComponentScan(basePackages = "com.example")
    class AppConfig { }

    class IoCExample {
        public static void main(String[] args) {
            // Create IoC container
            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

            // Retrieve bean from container
            MyService service = context.getBean(MyService.class);
            service.serve();
        }
}
