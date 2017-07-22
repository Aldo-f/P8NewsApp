package com.aldofieuw.android.newsapp;

public class News {

    private String mTitle;
    private String mSection;
    private String mWebUrl;
    private String mDate;

    public News(String mTitle, String mSection, String mWebUrl, String mDate) {
        this.mTitle = mTitle;
        this.mSection = mSection;
        this.mWebUrl = mWebUrl;
        this.mDate = mDate;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getWebUrl() {
        return mWebUrl;
    }

    public String getDate() {
        return mDate;
    }
}
