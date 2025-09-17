package com.SpringBootExample.BeanExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
    public class MyController {

        @Autowired
        private MyService1 myService1;

        public void doSomething() {
            myService1.serve();
        }
    }
