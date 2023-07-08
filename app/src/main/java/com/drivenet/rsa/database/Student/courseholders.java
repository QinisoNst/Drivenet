package com.drivenet.rsa.database.Student;


import com.drivenet.rsa.database.DaoClass.VisionDaoInsert;

public class courseholders {
    public courseholders() {
    }

    public void courseholder(VisionDaoInsert visionDaoInsert)
    {
        visionDaoInsert.insert(new courseholder
                (
                        0 ,
                        "" ,
                        "" ,
                        "" ,
                        "" ,
                        "",
                        0 ,
                        "",
                        0
                ));
    }

}
