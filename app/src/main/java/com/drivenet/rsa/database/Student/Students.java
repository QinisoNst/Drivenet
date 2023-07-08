package com.drivenet.rsa.database.Student;


import com.drivenet.rsa.database.DaoClass.VisionDaoInsert;

public class Students
{
    public void students(VisionDaoInsert visionDaoInsert)
    {
        visionDaoInsert.insert(new Student(
                "Username",
                0,
                0 ,
                0,
                0,
                0,
                0 ,
                0,
                0,
                0,
                0,
                0.0,
                0,
                0,
                0,
                0,
                "",
                "",
                "",
                "",
                "",
                "",
                0,
                "",
                ""
        ));
    }
}
