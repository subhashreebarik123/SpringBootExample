package com.SpringBootExample.BeanScopes;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
    @Scope("singleton")   // default
    public class SingletonBean {
        public SingletonBean() {
            System.out.println("👉 SingletonBean created");
        }
    }

