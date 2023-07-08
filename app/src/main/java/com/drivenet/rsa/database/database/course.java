package com.drivenet.rsa.database.database;

import com.drivenet.rsa.database.DaoClass.VisionDaoInsert;

import com.drivenet.rsa.database.Student.Applings;
import com.drivenet.rsa.database.Student.Students;

import com.drivenet.rsa.database.Student.courseholders;
import com.drivenet.rsa.database.Student.coursepickers;
import com.drivenet.rsa.database.uni.g.smu.smucourse;
import com.drivenet.rsa.database.uni.g.uwj.uwjcourse;

import com.drivenet.rsa.database.uni.m.umpcourse;
import com.drivenet.rsa.database.uni.nc.spu.spucourse;
import com.drivenet.rsa.database.uni.wc.uwc.uwccourse;


public class course
{
    private VisionDaoInsert visionDaoInsert;

    public course(VisionDaoInsert visionDaoInsert)
    {
        this.visionDaoInsert = visionDaoInsert;
    }
    public void spu(VisionDaoInsert visionDaoInsert)
    {
        spucourse university = new spucourse();
        university.getba(visionDaoInsert);
        university.getbed(visionDaoInsert);
        university.getbsc(visionDaoInsert);
        university.getems(visionDaoInsert);
        university.gethu(visionDaoInsert);
        university.getit(visionDaoInsert);
    }
    public void wits(VisionDaoInsert visionDaoInsert)
    {
        uwjcourse university = new uwjcourse();
        university.getba(visionDaoInsert);
        university.getbed(visionDaoInsert);
        university.getbsc(visionDaoInsert);
        university.geteb(visionDaoInsert);
        university.getems(visionDaoInsert);
        university.geths(visionDaoInsert);
        university.getlaw(visionDaoInsert);
        university.gethu(visionDaoInsert);
        university.getit(visionDaoInsert);
    }
    public void ump(VisionDaoInsert visionDaoInsert)
    {
        umpcourse university = new umpcourse();
        university.getba(visionDaoInsert);
        university.getbed(visionDaoInsert);
        university.getbsc(visionDaoInsert);
        university.getems(visionDaoInsert);
        university.gethu(visionDaoInsert);
        university.getit(visionDaoInsert);
    }
    public void smu(VisionDaoInsert visionDaoInsert)
    {
        smucourse university = new smucourse();
        university.geths(visionDaoInsert);
        university.getbsc(visionDaoInsert);

    }
    public void uwc(VisionDaoInsert visionDaoInsert)
    {
        uwccourse university = new uwccourse();
        university.getba(visionDaoInsert);
        university.getbed(visionDaoInsert);
        university.getbsc(visionDaoInsert);
        university.getems(visionDaoInsert);
        university.gethu(visionDaoInsert);
    }
    public void students(VisionDaoInsert visionDaoInsert)
    {
        Students student = new Students();
        student.students(visionDaoInsert);
    }
    public void appling(VisionDaoInsert visionDaoInsert)
    {
        Applings applings = new Applings();
        applings.Apply(visionDaoInsert);
    }
    public void courseholder(VisionDaoInsert visionDaoInsert)
    {
        courseholders holder = new courseholders();
        holder.courseholder(visionDaoInsert);
    }
    public void coursepicker(VisionDaoInsert visionDaoInsert)
    {
        coursepickers pickers = new coursepickers();
        pickers.coursepicker(visionDaoInsert);
    }
}
