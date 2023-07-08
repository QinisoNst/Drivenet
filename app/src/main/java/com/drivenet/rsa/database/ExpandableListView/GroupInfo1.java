package com.drivenet.rsa.database.ExpandableListView;

import java.util.ArrayList;

public class GroupInfo1 {

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

    private ArrayList<ChildInfo1> list = new ArrayList<ChildInfo1>();

    public ArrayList<ChildInfo1> getProductList()
    {
        return list;
    }

    public void setProductList(ArrayList<ChildInfo1> productList)
    {
        this.list = productList;
    }
}
