package com.tasanah.creationaldesignpattern.factory.method;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = FactoryMethodApplication.class)
class FactoryMethodApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testFactoryMethod() {
        var facebook = applicationContext.getBean(SocialMedia.class, SocialMediaType.FACEBOOK);
        var twitter = applicationContext.getBean(SocialMedia.class, SocialMediaType.TWITTER);
        var instagram = applicationContext.getBean(SocialMedia.class, SocialMediaType.INSTAGRAM);
        var tiktok = applicationContext.getBean(SocialMedia.class, SocialMediaType.TIKTOK);

        System.out.println(facebook);
        System.out.println(twitter);
        System.out.println(instagram);
        System.out.println(tiktok);
    }
}