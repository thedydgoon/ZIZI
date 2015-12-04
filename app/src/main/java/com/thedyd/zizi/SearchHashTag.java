package com.thedyd.zizi;

import java.io.Serializable;

/**
 * Created by Jeon Sung Yong on 2015-12-03.
 */
public class SearchHashTag implements Serializable {

    String hashTag;

    public SearchHashTag(String hashTag) {
        this.hashTag = hashTag;
    }

    public String getHashTag() {
        return hashTag;
    }
}
