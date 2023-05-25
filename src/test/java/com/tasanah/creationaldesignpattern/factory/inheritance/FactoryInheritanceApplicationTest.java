package com.tasanah.creationaldesignpattern.factory.inheritance;

import com.tasanah.creationaldesignpattern.factory.method.SocialMedia;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FactoryInheritanceApplication.class)
class FactoryInheritanceApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testFactoryInheritance() {
        var facebook = applicationContext.getBean("socialMediaFacebook", SocialMedia.class);
        var twitter = applicationContext.getBean("socialMediaTwitter", SocialMedia.class);
        var instagram = applicationContext.getBean("socialMediaInstagram", SocialMedia.class);
        var tiktok = applicationContext.getBean("socialMediaTiktok", SocialMedia.class);

        System.out.println(facebook);
        System.out.println(twitter);
        System.out.println(instagram);
        System.out.println(tiktok);
    }
}