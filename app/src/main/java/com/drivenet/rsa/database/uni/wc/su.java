package com.drivenet.rsa.database.uni.wc;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "su")

public class su {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int aps;
    private String university;
    private String programmes;
    private String faculty;
    private String careers;
    private String requirements;
    private int year;
    private String notes;

    public su(String university , String programmes , String faculty , String careers , String requirements , int year , String notes) {
        this.university = university;
        this.programmes = programmes;
        this.faculty = faculty;
        this.careers = careers;
        this.requirements = requirements;
        this.year = year;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAps() {
        return aps;
    }

    public void setAps(int aps) {
        this.aps = aps;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getProgrammes() {
        return programmes;
    }

    public void setProgrammes(String programmes) {
        this.programmes = programmes;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCareers() {
        return careers;
    }

    public void setCareers(String careers) {
        this.careers = careers;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
