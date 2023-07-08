package com.drivenet.rsa.Institutions.uniSA.adapter;

import java.util.ArrayList;

public class GroupInfo {

    private String name;
    private int image;


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    private ArrayList<ChildInfo> list = new ArrayList<ChildInfo>();

    public ArrayList<ChildInfo> getProductList()
    {
        return list;
    }

    public void setProductList(ArrayList<ChildInfo> productList)
    {
        this.list = productList;
    }
}