package com.drivenet.rsa.profile.application.Adapter;

public class ApplicationItem {

    private String mText1;
    private String mText2;
    public ApplicationItem(String mText2 , String mText1) {
        this.mText1 = mText1;
        this.mText2 = mText2;
    }

    public String getmText2() {
        return mText2;
    }

    public void setmText2(String mText2) {
        this.mText2 = mText2;
    }

    public String getmText1() {
        return mText1;
    }

    public void setmText1(String mText1) {
        this.mText1 = mText1;
    }
}