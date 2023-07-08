package com.drivenet.rsa.homefragments;

public class HomeItem1 {

    private String mText1;
    private String mText2;
    private int image;

    public HomeItem1(String mText1 , String mText2 , int image) {
        this.mText1 = mText1;
        this.mText2 = mText2;
        this.image = image;
    }

    public String getmText1() {
        return mText1;
    }

    public void setmText1(String mText1) {
        this.mText1 = mText1;
    }

    public String getmText2() {
        return mText2;
    }

    public void setmText2(String mText2) {
        this.mText2 = mText2;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}