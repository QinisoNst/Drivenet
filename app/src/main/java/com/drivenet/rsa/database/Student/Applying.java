package com.drivenet.rsa.database.Student;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
        (
                tableName = "Applying"
        )
public class Applying
{
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String Title;
    private String Initials;
    private String First_Names;
    private String Surname;
    private int Birthdate;
    private int Citizenship_Code;
    private int ID__Passport_Number;
    private String Gender;
    private String Marital_Status;
    private String Home_Language;
    private String Population_Group;
    private String Prefered_Language;
    private String Address_Line_1;
    private String Address_Line_2;
    private String City_Town;
    private String Province;
    private int Postal_Code;
    private String Residence_Accommodation;
    private int Cell_Phone;
    private String Email;
    private String Maiden_Names;
    private String Activity_Last_Year;
    private String Highest_Grade_Passed;
    private String Senior_Secondary_School;
    private int Matric_Date;
    private String Matriculation_Type;


    public Applying()
    {

    }
    @Ignore

    public Applying(String title , String initials , String first_Names , String surname , String gender , String marital_Status , String home_Language , String population_Group , String prefered_Language , String address_Line_1 , String address_Line_2 , String city_Town , String province , String residence_Accommodation  , String email , String maiden_Names , String activity_Last_Year , String highest_Grade_Passed , String senior_Secondary_School  , String matriculation_Type) {
        Title = title;
        Initials = initials;
        First_Names = first_Names;
        Surname = surname;
        Gender = gender;
        Marital_Status = marital_Status;
        Home_Language = home_Language;
        Population_Group = population_Group;
        Prefered_Language = prefered_Language;
        Address_Line_1 = address_Line_1;
        Address_Line_2 = address_Line_2;
        City_Town = city_Town;
        Province = province;
        Residence_Accommodation = residence_Accommodation;
        Email = email;
        Maiden_Names = maiden_Names;
        Activity_Last_Year = activity_Last_Year;
        Highest_Grade_Passed = highest_Grade_Passed;
        Senior_Secondary_School = senior_Secondary_School;
        Matriculation_Type = matriculation_Type;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getInitials() {
        return Initials;
    }

    public void setInitials(String initials) {
        Initials = initials;
    }

    public String getFirst_Names() {
        return First_Names;
    }

    public void setFirst_Names(String first_Names) {
        First_Names = first_Names;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(int birthdate) {
        Birthdate = birthdate;
    }

    public int getCitizenship_Code() {
        return Citizenship_Code;
    }

    public void setCitizenship_Code(int citizenship_Code) {
        Citizenship_Code = citizenship_Code;
    }

    public int getID__Passport_Number() {
        return ID__Passport_Number;
    }

    public void setID__Passport_Number(int ID__Passport_Number) {
        this.ID__Passport_Number = ID__Passport_Number;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getMarital_Status() {
        return Marital_Status;
    }

    public void setMarital_Status(String marital_Status) {
        Marital_Status = marital_Status;
    }

    public String getHome_Language() {
        return Home_Language;
    }

    public void setHome_Language(String home_Language) {
        Home_Language = home_Language;
    }

    public String getPopulation_Group() {
        return Population_Group;
    }

    public void setPopulation_Group(String population_Group) {
        Population_Group = population_Group;
    }

    public String getPrefered_Language() {
        return Prefered_Language;
    }

    public void setPrefered_Language(String prefered_Language) {
        Prefered_Language = prefered_Language;
    }

    public String getAddress_Line_1() {
        return Address_Line_1;
    }

    public void setAddress_Line_1(String address_Line_1) {
        Address_Line_1 = address_Line_1;
    }

    public String getAddress_Line_2() {
        return Address_Line_2;
    }

    public void setAddress_Line_2(String address_Line_2) {
        Address_Line_2 = address_Line_2;
    }

    public String getCity_Town() {
        return City_Town;
    }

    public void setCity_Town(String city_Town) {
        City_Town = city_Town;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public int getPostal_Code() {
        return Postal_Code;
    }

    public void setPostal_Code(int postal_Code) {
        Postal_Code = postal_Code;
    }

    public String getResidence_Accommodation() {
        return Residence_Accommodation;
    }

    public void setResidence_Accommodation(String residence_Accommodation) {
        Residence_Accommodation = residence_Accommodation;
    }

    public int getCell_Phone() {
        return Cell_Phone;
    }

    public void setCell_Phone(int cell_Phone) {
        Cell_Phone = cell_Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMaiden_Names() {
        return Maiden_Names;
    }

    public void setMaiden_Names(String maiden_Names) {
        Maiden_Names = maiden_Names;
    }

    public String getActivity_Last_Year() {
        return Activity_Last_Year;
    }

    public void setActivity_Last_Year(String activity_Last_Year) {
        Activity_Last_Year = activity_Last_Year;
    }

    public String getHighest_Grade_Passed() {
        return Highest_Grade_Passed;
    }

    public void setHighest_Grade_Passed(String highest_Grade_Passed) {
        Highest_Grade_Passed = highest_Grade_Passed;
    }

    public String getSenior_Secondary_School() {
        return Senior_Secondary_School;
    }

    public void setSenior_Secondary_School(String senior_Secondary_School) {
        Senior_Secondary_School = senior_Secondary_School;
    }

    public int getMatric_Date() {
        return Matric_Date;
    }

    public void setMatric_Date(int matric_Date) {
        Matric_Date = matric_Date;
    }

    public String getMatriculation_Type() {
        return Matriculation_Type;
    }

    public void setMatriculation_Type(String matriculation_Type) {
        Matriculation_Type = matriculation_Type;
    }
}
