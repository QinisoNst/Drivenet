package com.drivenet.rsa.database.DaoClass;

import androidx.room.Dao;
import androidx.room.Insert;

import com.drivenet.rsa.database.Student.Applying;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.Student.courseholder;
import com.drivenet.rsa.database.Student.coursepicker;
import com.drivenet.rsa.database.uni.ec.Ufh;
import com.drivenet.rsa.database.uni.ec.Wsu;
import com.drivenet.rsa.database.uni.ec.nmu.nmu;
import com.drivenet.rsa.database.uni.ec.ru.ru;
import com.drivenet.rsa.database.uni.fs.Cut;
import com.drivenet.rsa.database.uni.fs.Ufs;
import com.drivenet.rsa.database.uni.g.Tut;
import com.drivenet.rsa.database.uni.g.Uj;
import com.drivenet.rsa.database.uni.g.smu.smu;
import com.drivenet.rsa.database.uni.g.up;
import com.drivenet.rsa.database.uni.g.uwj.uwj;
import com.drivenet.rsa.database.uni.g.vut;
import com.drivenet.rsa.database.uni.k.Ukzn;
import com.drivenet.rsa.database.uni.k.dut;
import com.drivenet.rsa.database.uni.k.mut;
import com.drivenet.rsa.database.uni.k.unizulu;
import com.drivenet.rsa.database.uni.l.ul;
import com.drivenet.rsa.database.uni.l.univen;
import com.drivenet.rsa.database.uni.m.ump;
import com.drivenet.rsa.database.uni.nc.spu.spu;
import com.drivenet.rsa.database.uni.nw.nwu;
import com.drivenet.rsa.database.uni.other.unisa;
import com.drivenet.rsa.database.uni.wc.cput;
import com.drivenet.rsa.database.uni.wc.su;
import com.drivenet.rsa.database.uni.wc.uct;
import com.drivenet.rsa.database.uni.wc.uwc.uwc;

@Dao
public interface VisionDaoInsert
{
    @Insert
    void insert(Student student);
    //////////////////////////////
    @Insert
    void insert(nmu nmu);

    @Insert
    void insert(ru ru);

    @Insert
    void insert(Ufh ufh);
    @Insert
    void insert(Wsu wsu);
    //////////////////////////////////////
    @Insert
    void insert(Cut cut);
    @Insert
    void insert(Ufs ufs);
    /////////////////////////////////
    @Insert
    void insert(smu smu);
    @Insert
    void insert(Tut tut);
    @Insert
    void insert(Uj uj);
    @Insert
    void insert(up up);
    @Insert
    void insert(uwj uwj);
    @Insert
    void insert(vut vut);
    ////////////////////////////
    @Insert
    void insert(dut dut);
    @Insert
    void insert(mut mut);
    @Insert
    void insert(Ukzn Ukzn);
    @Insert
    void insert(unizulu note);
    ////////////////////////
    @Insert
    void insert(ul ul);
    @Insert
    void insert(univen univen);
    //////////////////////////
    @Insert
    void insert(ump ump);
    /////////////////////
    @Insert
    void insert(spu spu);
    ///////////////////////////////
    @Insert
    void insert(nwu nwu);
    ///////////////////////////
    @Insert
    void insert(unisa unisa);
    /////////////////////////
    @Insert
    void insert(cput cput);
    @Insert
    void insert(su su);
    @Insert
    void insert(uct uct);
    @Insert
    void insert(uwc uwc);
    /////////////////////////////
    @Insert
    void insert(Applying applying);
    /////////////////////////////
    @Insert
    void insert(courseholder courseholder);
    /////////////////////////////
    @Insert
    void insert(coursepicker coursepicker);
}