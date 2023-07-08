package com.drivenet.rsa.database.Student;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
        (
                tableName = "Student"
        )

public class Student
{

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String username;

    private int maths;
    private int english;

    private int lo;

    private int language;
    private int subject1;
    private int subject2;
    private int subject3;
    private int fomula1;
    private int fomula2;
    private int fomula3;
    private Double fomula4;
    private int fomula5;
    private int fomula6;
    private int fomula7;
    private int fomula8;

    private String institution;
    private String country;

    private String sub1;
    private String sub2;
    private String sub3;
    private String lang;
    private int staring;
    private String uni;
    private String type;
    public Student(int staring) {
        this.staring = staring;
    }
    @Ignore

    public Student(String username , int maths , int english , int lo , int language , int subject1 , int subject2 , int subject3 , int fomula1 , int fomula2 , int fomula3 , Double fomula4 , int fomula5 , int fomula6 , int fomula7,int fomula8 , String institution , String country , String sub1 , String sub2 , String sub3 , String lang , int staring,String uni,String type) {
        this.username = username;
        this.maths = maths;
        this.english = english;
        this.lo = lo;
        this.language = language;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.fomula1 = fomula1;
        this.fomula2 = fomula2;
        this.fomula3 = fomula3;
        this.fomula4 = fomula4;
        this.fomula5 = fomula5;
        this.fomula6 = fomula6;
        this.fomula7 = fomula7;
        this.fomula8 = fomula8;
        this.institution = institution;
        this.country = country;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.lang = lang;
        this.staring = staring;
        this.uni = uni;
        this.type = type;

    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public int getFomula8() {
        return fomula8;
    }

    public void setFomula8(int fomula8) {
        this.fomula8 = fomula8;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getLo() {
        return lo;
    }

    public void setLo(int lo) {
        this.lo = lo;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getSubject1() {
        return subject1;
    }

    public void setSubject1(int subject1) {
        this.subject1 = subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public void setSubject3(int subject3) {
        this.subject3 = subject3;
    }

    public int getFomula1() {
        return fomula1;
    }

    public void setFomula1(int fomula1) {
        this.fomula1 = fomula1;
    }

    public int getFomula2() {
        return fomula2;
    }

    public void setFomula2(int fomula2) {
        this.fomula2 = fomula2;
    }

    public int getFomula3() {
        return fomula3;
    }

    public void setFomula3(int fomula3) {
        this.fomula3 = fomula3;
    }

    public Double getFomula4() {
        return fomula4;
    }

    public void setFomula4(Double fomula4) {
        this.fomula4 = fomula4;
    }

    public int getFomula5() {
        return fomula5;
    }

    public void setFomula5(int fomula5) {
        this.fomula5 = fomula5;
    }

    public int getFomula6() {
        return fomula6;
    }

    public void setFomula6(int fomula6) {
        this.fomula6 = fomula6;
    }

    public int getFomula7() {
        return fomula7;
    }

    public void setFomula7(int fomula7) {
        this.fomula7 = fomula7;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSub1() {
        return sub1;
    }

    public void setSub1(String sub1) {
        this.sub1 = sub1;
    }

    public String getSub2() {
        return sub2;
    }

    public void setSub2(String sub2) {
        this.sub2 = sub2;
    }

    public String getSub3() {
        return sub3;
    }

    public void setSub3(String sub3) {
        this.sub3 = sub3;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getStaring() {
        return staring;
    }

    public void setStaring(int staring) {
        this.staring = staring;
    }
}