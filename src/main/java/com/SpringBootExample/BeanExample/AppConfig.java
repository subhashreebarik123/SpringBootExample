package com.SpringBootExample.BeanExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class AppConfig {

        @Bean
        public MyService1 myService1() {
            return new MyService1();
        }
    }
