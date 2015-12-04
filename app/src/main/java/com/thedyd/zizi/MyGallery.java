package com.thedyd.zizi;

import java.io.Serializable;

/**
 * Created by Jeon Sung Yong on 2015-12-04.
 */
public class MyGallery implements Serializable {

    public String galleryTitle;
    public String gallerySubtitle;
    public int galleryProfile;

    public MyGallery(String galleryTitle, String gallerySubtitle, int galleryProfile) {
        this.galleryTitle = galleryTitle;
        this.gallerySubtitle = gallerySubtitle;
        this.galleryProfile = galleryProfile;
    }

    public String getGalleryTitle() {
        return galleryTitle;
    }

    public String getGallerySubtitle() {
        return gallerySubtitle;
    }

    public int getGalleryProfile() {
        return galleryProfile;
    }
}
