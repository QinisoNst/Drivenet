package com.drivenet.rsa.wantedcode.careers.adapter;

public class CareerItem {

    private String mText1;
    private int mText2;

    public CareerItem(String text1, int text2) {
        mText1 = text1;
        mText2 = text2;
    }

    public String getText1() {
        return mText1;
    }

    public void setText1(String mText1) {
        this.mText1 = mText1;
    }

    public int getText2() {
        return mText2;
    }

    public void setText2(int mText2) {
        this.mText2 = mText2;
    }
}