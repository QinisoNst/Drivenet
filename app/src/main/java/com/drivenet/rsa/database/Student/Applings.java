package com.drivenet.rsa.database.Student;


import com.drivenet.rsa.database.DaoClass.VisionDaoInsert;

public class Applings
{
   /* public void Course(VisionDaoInsert visionDaoInsert)
    {
        visionDaoInsert.insert(new Apply
                (
                        "","","","",0,"",
                        0, "","", "",
                        "","","","",
                        "","",0, "",
                        0,"","", "",
                        "","",0,""
                ));
    }
    */
    public void Apply(VisionDaoInsert visionDaoInsert)
    {
        visionDaoInsert.insert(new Applying
                (
                        "Mr","O P E","Olorato Pule Edwin","Rakgotla",
                        "Male","Single", "Setswana",
                        "Black","English","22 8th Avenue","Kieserville",
                        "Lichtenburg","North-West", "Yes",
                        "Phatsthephatsanator@gmail.com","", "Upgrading",
                        "Matric","Lichtenburg Hoerskool","Bachelors"
                ));
    }
}
