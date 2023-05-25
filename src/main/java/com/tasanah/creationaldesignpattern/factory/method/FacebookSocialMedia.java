package com.tasanah.creationaldesignpattern.factory.method;

import lombok.Getter;

public class FacebookSocialMedia implements SocialMedia {

    @Getter
    private final String name = "FACEBOOK";
    @Getter
    private final String link = "https://facebook.com";
    @Getter
    private final SocialMediaType type = SocialMediaType.FACEBOOK;
}
