package com.tasanah.creationaldesignpattern.builder;

import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void testBuilder() {
        var phone = Product.builder()
                .id("XXX-XXX-XXX")
                .name("iPhone")
                .sku("Apple")
                .price(20000000L)
                .build();

        System.out.println(phone);
    }
}