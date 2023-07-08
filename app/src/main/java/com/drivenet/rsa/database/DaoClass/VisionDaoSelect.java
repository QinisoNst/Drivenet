package com.drivenet.rsa.database.DaoClass;

import androidx.room.Dao;
import androidx.room.Query;

import com.drivenet.rsa.database.Student.Applying;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.Student.courseholder;
import com.drivenet.rsa.database.Student.coursepicker;
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

import java.util.List;
@Dao

public interface VisionDaoSelect {

    @Query("SELECT * FROM ufs WHERE faculty = :ww")
    List<Ufs> getufs(String ww);

    @Query("SELECT * FROM uwj WHERE faculty = :ww")
    List<uwj> getuwj(String ww);

    @Query("SELECT * FROM spu WHERE faculty = :ww")
    List<spu> getspu(String ww);

    @Query("SELECT * FROM nmu WHERE faculty = :ww")
    List<nmu> getnmu(String ww);

    @Query("SELECT * FROM uct WHERE faculty = :ww")
    List<uct> getuct(String ww);

    @Query("SELECT * FROM uj WHERE faculty = :ww")
    List<Uj> getUj(String ww);

    @Query("SELECT * FROM ump WHERE faculty = :ww")
    List<ump> getump(String ww);

    @Query("SELECT * FROM unisa WHERE faculty = :ww")
    List<unisa> getunisa(String ww);

    @Query("SELECT * FROM univen WHERE faculty = :ww")
    List<univen> getuniven(String ww);

    @Query("SELECT * FROM ul WHERE faculty = :ww")
    List<ul> getul(String ww);

    @Query("SELECT * FROM unizulu WHERE faculty = :ww")
    List<unizulu> getunizulu(String ww);

    @Query("SELECT * FROM up WHERE faculty = :ww")
    List<up> getup(String ww);

    @Query("SELECT * FROM uwc WHERE faculty = :ww")
    List<uwc> getuwc(String ww);

    @Query("SELECT * FROM nwu WHERE faculty = :ww")
    List<nwu> getnwu(String ww);

    @Query("SELECT * FROM ru WHERE faculty = :ww")
    List<ru> getru(String ww);

    @Query("SELECT * FROM smu WHERE faculty = :ww")
    List<smu> getsmu(String ww);

    @Query("SELECT * FROM wsu WHERE faculty = :ww")
    List<Wsu> getwsu(String ww);

    @Query("SELECT * FROM cput WHERE faculty = :ww")
    List<cput> getcput(String ww);

    @Query("SELECT * FROM cut WHERE faculty = :ww")
    List<Cut> getcut(String ww);

    @Query("SELECT * FROM dut WHERE faculty = :ww")
    List<dut> getdut(String ww);

    @Query("SELECT * FROM su WHERE faculty = :ww")
    List<su> getsu(String ww);

    @Query("SELECT * FROM tut WHERE faculty = :ww")
    List<Tut> gettut(String ww);

    @Query("SELECT * FROM vut WHERE faculty = :ww")
    List<vut> getvut(String ww);

    @Query("SELECT * FROM Ufh WHERE faculty = :ww")
    List<vut> getUfh(String ww);

    @Query("SELECT * FROM mut WHERE faculty = :ww")
    List<mut> getmut(String ww);

    @Query("SELECT * FROM ukzn WHERE faculty = :ww")
    List<Ukzn> getukzn(String ww);

    @Query("SELECT * from Student")
    List<Student> getStudent();

    @Query("SELECT * from courseholder")
    List<courseholder> getcourseholder();

    @Query("SELECT * FROM uwj WHERE aps BETWEEN 0 AND :fomula")
    List<uwj>getapsuwj(int fomula);

    @Query("SELECT * FROM spu WHERE aps BETWEEN 0 AND :fomula")
    List<spu>getapspu(int fomula);

    @Query("SELECT * FROM uwc WHERE aps BETWEEN 0 AND :fomula")
    List<uwc>getapsuwc(int fomula);

    @Query("SELECT * FROM smu WHERE aps BETWEEN 0 AND :fomula")
    List<smu>getapssmu(int fomula);

    @Query("SELECT * FROM ump WHERE aps BETWEEN 0 AND :fomula")
    List<ump>getapsump(int fomula);

    @Query("SELECT * from Applying")
    List<Applying> getAppling();

    @Query("SELECT * from Applying")
    List<Applying> getAppling1();

    @Query("SELECT * from coursepicker")
    List<coursepicker> getcoursepicker();

    @Query("SELECT * from coursepicker where id =:hin")
    List<coursepicker> getcoursepickerw(int hin);
}
