package com.drivenet.rsa.wantedcode.aps.subjects.adapter;

public class Province
{
    private String animalName;
    private int animalImage;
    public Province(String animalName)
    {
        this.animalName = animalName;
    }
    public int getAnimalImage()
    {
        return animalImage;
    }

    public String getAnimalName()
    {
        return this.animalName;
    }
}
