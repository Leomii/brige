package com.leomii.auto.loan.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * spring bean util 功能类
 *
 * @author leomii
 */
@Component
public class SpringUtils implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContextParam) {
        applicationContext = applicationContextParam;
    }

    public Object getObject(String id, Class clazz) {
        return applicationContext.getBean(id, clazz);
    }

    public <T> T getObject(Class<T> tClass) {
        return applicationContext.getBean(tClass);
    }

    public Object getBean(String tClass) {
        return applicationContext.getBean(tClass);
    }

    public <T> T getBean(Class<T> tClass) {
        return applicationContext.getBean(tClass);
    }
}