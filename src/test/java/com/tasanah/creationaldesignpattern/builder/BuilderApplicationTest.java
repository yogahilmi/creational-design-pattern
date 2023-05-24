package com.tasanah.creationaldesignpattern.builder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest(classes = BuilderApplication.class)
class BuilderApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testBuilderPrototype() {
        var product = applicationContext.getBean("productGadget", Product.class);
        product.setName("Macbook M2");

        System.out.println(product);
    }
}