package com.melayer.model;

/**
 * Created by root on 8/10/15.
 */
public class RecyclerItem {

    private Integer imageId;
    private String textInfo;

    public RecyclerItem(Integer imageId, String textInfo) {
        this.imageId = imageId;
        this.textInfo = textInfo;
    }

    public String getTextInfo() {
        return textInfo;
    }

    public void setTextInfo(String textInfo) {
        this.textInfo = textInfo;
    }

    public Integer getImageId() {

        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }
}
