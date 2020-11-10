package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Bar implements ApplicationContextAware, InitializingBean {

    private Foo foo;

    private ApplicationContext context;

    public Foo getFoo() {
        return foo;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        foo = context.getBean(Foo.class);
    }

    @Override
    public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public void hi() {
        System.out.println("Hi, " + foo.name());
    }

    public String name() {
        return "Bar";
    }
}
