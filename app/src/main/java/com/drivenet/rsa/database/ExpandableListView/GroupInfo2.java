package com.drivenet.rsa.database.ExpandableListView;

import java.util.ArrayList;

public class GroupInfo2
{

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

    private ArrayList<ChildInfo2> list = new ArrayList<ChildInfo2>();

    public ArrayList<ChildInfo2> getProductList()
    {
        return list;
    }

    public void setProductList(ArrayList<ChildInfo2> productList)
    {
        this.list = productList;
    }
}
