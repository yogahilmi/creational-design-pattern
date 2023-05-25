package com.tasanah.creationaldesignpattern.factory.method;

import lombok.Getter;

public class TiktokSocialMedia implements SocialMedia {

    @Getter
    private final String name = "TIKTOK";
    @Getter
    private final String link = "https://tiktok.com";
    @Getter
    private final SocialMediaType type = SocialMediaType.TIKTOK;
}
