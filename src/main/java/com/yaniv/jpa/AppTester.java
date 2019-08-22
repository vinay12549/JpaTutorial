package com.yaniv.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Created by vikumar on 2019-08-16
 */
public class AppTester {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductRepo productRepo = context.getBean(ProductRepo.class);
        productRepo.save();

    }

}
