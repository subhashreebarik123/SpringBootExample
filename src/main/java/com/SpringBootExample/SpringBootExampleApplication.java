package com.SpringBootExample;

import com.SpringBootExample.BeanScopes.PrototypeBean;
import com.SpringBootExample.BeanScopes.SingletonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootExampleApplication implements CommandLineRunner {

    @Autowired
    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n=== Testing Singleton Scope ===");
        SingletonBean s1 = context.getBean(SingletonBean.class);
        SingletonBean s2 = context.getBean(SingletonBean.class);
        System.out.println("Singleton beans are same? " + (s1 == s2));

        System.out.println("\n=== Testing Prototype Scope ===");
        PrototypeBean p1 = context.getBean(PrototypeBean.class);
        PrototypeBean p2 = context.getBean(PrototypeBean.class);
        System.out.println("Prototype beans are same? " + (p1 == p2));
    }
}