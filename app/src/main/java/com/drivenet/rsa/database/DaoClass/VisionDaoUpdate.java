package com.drivenet.rsa.database.DaoClass;
import androidx.room.Dao;
import androidx.room.Query;
@Dao
public interface VisionDaoUpdate
{
    @Query("UPDATE Student SET username = :username WHERE id =1")
    void username(String username);

    @Query("UPDATE Student SET lang = :lang WHERE id =1")
    void lang(String lang);

    @Query("UPDATE Student SET sub1 = :sub1 WHERE id =1")
    void sub1(String sub1);

    @Query("UPDATE Student SET sub2 = :sub2 WHERE id =1")
    void sub2(String sub2);

    @Query("UPDATE Student SET sub3 = :sub3 WHERE id =1")
    void sub3(String sub3);

    @Query("UPDATE Student SET country = :country WHERE id =1")
    void settingcountry(String country);
    @Query("UPDATE Student SET type = :institution WHERE id =1")
    void settinginstitutiona(String institution);

    @Query("UPDATE Student SET uni = :country WHERE id =1")
    void settinguni(String country);
    @Query("UPDATE Student SET maths = :maths , english = :english ,lo = :lo, language =:language , subject1 = :subject1, subject2 = :subject2, subject3 =:subject3  WHERE id =1")
    void subjects(int maths,int english,int lo, int language, int subject1, int subject2, int subject3);

    @Query("UPDATE Student SET fomula1 = :fomula1 , fomula2 = :fomula2 ,fomula3 =:fomula3, fomula4 =:fomula4 , fomula5 = :fomula5, fomula6 = :fomula6, fomula7 = :fomula7 ,fomula8 = :fomula8 WHERE id =1")
    void fomula(int fomula1, int fomula2, int fomula3, double fomula4, int fomula5, int fomula6, int fomula7,int fomula8);

    @Query("UPDATE Applying SET Title = :Title , Initials = :Initials ,First_Names =:First_Names, Surname =:Surname , Birthdate = :Birthdate, Citizenship_Code = :Citizenship_Code, ID__Passport_Number = :ID__Passport_Number ,Gender = :Gender , Home_Language = :Home_Language, Prefered_Language=:Prefered_Language, Population_Group =:Population_Group WHERE id =1")
    void apply3(String Title, String Initials, String First_Names, String Surname, int Birthdate, int Citizenship_Code, int ID__Passport_Number,String Gender, String Home_Language,String Prefered_Language,String Population_Group);

    @Query("UPDATE Applying SET Marital_Status = :Marital_Status, Maiden_Names = :Maiden_Names, Activity_Last_Year = :Activity_Last_Year, Highest_Grade_Passed = :Highest_Grade_Passed, Senior_Secondary_School = :Senior_Secondary_School , Matric_Date = :Matric_Date , Matriculation_Type = :Matriculation_Type WHERE id =1")
    void apply2(String Marital_Status,String Maiden_Names, String Activity_Last_Year, String Highest_Grade_Passed, String Senior_Secondary_School,int Matric_Date, String Matriculation_Type );

    @Query("UPDATE Applying SET Address_Line_1 = :Address_Line_1,Address_Line_2 = :Address_Line_2,City_Town = :City_Town,Province = :Province,Postal_Code = :Postal_Code,Residence_Accommodation = :Residence_Accommodation,Cell_Phone = :Cell_Phone,Email = :Email WHERE id =1")
    void apply1(String Address_Line_1,String Address_Line_2,String City_Town,String Province, int Postal_Code,String Residence_Accommodation, int Cell_Phone, String Email );

    @Query("UPDATE courseholder SET  aps = :aps, university = :university, programmes=:programmes,faculty=:faculty,careers=:careers, requirements=:requirements, year =:year,notes =:notes, myaps =:myaps where id =1 ")
    void holder(int aps,String university,String programmes,String faculty,String careers,String requirements,int year,String notes,int myaps);

    @Query("UPDATE coursepicker SET  aps = :aps, university = :university, programmes=:programmes,faculty=:faculty,careers=:careers, requirements=:requirements, year =:year,notes =:notes where id =:home ")
    void picker(int aps,String university,String programmes,String faculty,String careers,String requirements,int year,String notes,int home);
}





