package com.drivenet.rsa.homefragments;

public class userinterface
{

    public String country;

    public String institution;
    public int flags[];
    public String institutionNames[];

    public String getInstitution()
    {
        return institution;
    }

    public void setInstitution(String institution)
    {
        this.institution = institution;
    }


    public String[] getInstitutionNames() {
        return institutionNames;
    }
    public void setInstitutionNames(String[] institutionNames)
    {
        this.institutionNames = institutionNames;
    }
    public int[] getFlags()
    {
        return flags;
    }
    public void setFlags(int[] flags)
    {
        this.flags = flags;
    }

    public userinterface()
    {

    }
    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

}

