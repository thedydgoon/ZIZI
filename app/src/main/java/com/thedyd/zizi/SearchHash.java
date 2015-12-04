package com.thedyd.zizi;

import java.io.Serializable;

/**
 * Created by Jeon Sung Yong on 2015-12-02.
 */
public class SearchHash implements Serializable {

    public String hashTitle;
    public int totalCount;
    public int latestImage1;
    public int latestImage2;
    public int latestImage3;


    public SearchHash(String hashTitle, int totalCount, int latestImage1, int latestImage2, int latestImage3) {
        this.hashTitle = hashTitle;
        this.totalCount = totalCount;
        this.latestImage1 = latestImage1;
        this.latestImage2 = latestImage2;
        this.latestImage3 = latestImage3;
    }

    public String getHashTitle() {
        return hashTitle;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getLatestImage1() {
        return latestImage1;
    }

    public int getLatestImage2() {
        return latestImage2;
    }

    public int getLatestImage3() {
        return latestImage3;
    }

}
