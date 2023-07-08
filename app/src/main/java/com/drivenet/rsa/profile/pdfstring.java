package com.drivenet.rsa.profile;

import android.content.Context;

import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Applying;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.Student.coursepicker;
import com.drivenet.rsa.database.database.VisionDatabase;

import java.util.List;

public class pdfstring
{
    public pdfstring()
    { }
    private List<Student> student;

    private List<coursepicker> course;

    private List<Applying> apply;

    public String generatePDF(Context context)
    {
       return students(context)+"\n"+"\n"+"\n"/*+courses1(context)+"\n"+"\n"+"\n"+courses2(context)+"\n"+"\n"+"\n"+courses3(context)+"\n"+"\n"+"\n"+applys(context)*/;
    }

    private String students(Context context)
    {

        String username             ="";
        int    maths       =0          ;
        int    english     =0            ;
        int    lo          =0           ;
        int    language    =0         ;
        int    subject1    =0         ;
        int    subject2    =0         ;
        int    subject3    =0         ;
        int    fomula1     =0        ;
        int    fomula2     =0        ;
        int    fomula3     =0        ;
        Double fomula4     =0.0        ;
        int    fomula5     =0        ;
        int    fomula6     =0        ;
        int    fomula7     =0        ;
        int    fomula8     =0        ;
        String institution =""        ;
        String country     =""        ;
        String sub1        =""         ;
        String sub2        =""         ;
        String sub3        =""         ;
        String lang        =""         ;
        int    staring     =0         ;
        String uni         ="" ;
        String type        =""  ;
        student = VisionDatabase.getDatabase(context).getSelect().getStudent();
        String Title =" ";
        for(Student usr : student)
        {
            username = usr.getUsername();
            maths = usr.getMaths();
            english = usr.getEnglish();
            lo = usr.getLo();
            language = usr.getLanguage();
            subject1 = usr.getSubject1();
            subject2 = usr.getSubject2();
            subject3 = usr.getSubject3();

            fomula1 = usr.getFomula1();
            fomula2 = usr.getFomula2();
            fomula3 = usr.getFomula3();
            fomula4 = usr.getFomula4();
            fomula5 = usr.getFomula5();
            fomula6 = usr.getFomula6();
            fomula7 = usr.getFomula7();
            fomula8 = usr.getFomula8();

            institution = usr.getInstitution();
            country = usr.getCountry();
            sub1 = usr.getSub1();
            sub2 = usr.getSub2();
            sub3 = usr.getSub3();
            lang = usr.getLang();
            staring = usr.getStaring();
            uni = usr.getUni();
            type = usr.getType();

        }
        Title   =
                "Username "+username +"\n" +
                        "\n" +
                        "Subjects: \n" +
                        "\n " +
                        "maths       " +maths      +"\n"+
                        "english     " +english    +"\n"+
                        "lo          " +lo         +"\n"+
                        "language    " +language   +"\n"+
                        "subject1    " +subject1   +"\n"+
                        "subject2    " +subject2   +"\n"+
                        "subject3    " +subject3   +"\n"+
                        "fomula1     " +fomula1    +"\n"+
                        "fomula2     " +fomula2    +"\n"+
                        "fomula3     " +fomula3    +"\n"+
                        "fomula4     " +fomula4    +"\n"+
                        "fomula5     " +fomula5    +"\n"+
                        "fomula6     " +fomula6    +"\n"+

                        "fomula7     " +fomula7    +"\n                   "+
                        "fomula8     " +fomula8    +"\n"+
                        "institution " +institution+"\n"+
                        "country     " +country    +"\n"+
                        "sub1        " +sub1       +"\n"+
                        "sub2        " +sub2       +"\n"+
                        "sub3        " +sub3       +"\n"+
                        "lang        " +lang       +"\n"+
                        "staring     " +staring    +"\n"+
                        "uni         " +uni        +"\n"+
                        "type        " +type      ;


        return Title;
    }
    private String courses1(Context context)
    {

        int             aps=0;
        String   university =""    ;
        String   programmes =""    ;
        String      faculty =""    ;
        String      careers =""    ;
        String requirements =""    ;
        int            year=0;
        String        notes="";

        course = VisionDatabase.getDatabase(context).getSelect().getcoursepickerw(1);
        String Title =" ";
        for(coursepicker usr : course)
        {
            aps = usr.getAps();
            university = usr.getUniversity();
            programmes = usr.getProgrammes();
            faculty= usr.getFaculty();
            careers = usr.getCareers();
            requirements = usr.getRequirements();
            year = usr.getYear();
            notes = usr.getNotes();

        }
        Title      = "\n"     +
                "aps"                  +aps +"\n"+
                "university" +    university+"\n"+
                "programmes" +    programmes+"\n"+
                "faculty" +          faculty+"\n"+
                "careers" +          careers+"\n"+
                "requirements" +requirements+"\n"+
                "year" +                year+"\n"+
                "notes" +              notes;

    return Title;
    }

    private String courses2(Context context)
    {

        int             aps=0;
        String   university =""    ;
        String   programmes =""    ;
        String      faculty =""    ;
        String      careers =""    ;
        String requirements =""    ;
        int            year=0;
        String        notes="";

        course = VisionDatabase.getDatabase(context).getSelect().getcoursepickerw(2);
        String Title =" ";
        for(coursepicker usr : course)
        {
            aps = usr.getAps();
            university = usr.getUniversity();
            programmes = usr.getProgrammes();
            faculty= usr.getFaculty();
            careers = usr.getCareers();
            requirements = usr.getRequirements();
            year = usr.getYear();
            notes = usr.getNotes();

        }
        Title      = "\n"     +
                "aps"                  +aps +"\n"+
                "university" +    university+"\n"+
                "programmes" +    programmes+"\n"+
                "faculty" +          faculty+"\n"+
                "careers" +          careers+"\n"+
                "requirements" +requirements+"\n"+
                "year" +                year+"\n"+
                "notes" +              notes;

        return Title;
    }
    private String courses3(Context context)
    {

        int             aps=0;
        String   university =""    ;
        String   programmes =""    ;
        String      faculty =""    ;
        String      careers =""    ;
        String requirements =""    ;
        int            year=0;
        String        notes="";

        course = VisionDatabase.getDatabase(context).getSelect().getcoursepickerw(3);
        String Title =" ";
        for(coursepicker usr : course)
        {
            aps = usr.getAps();
            university = usr.getUniversity();
            programmes = usr.getProgrammes();
            faculty= usr.getFaculty();
            careers = usr.getCareers();
            requirements = usr.getRequirements();
            year = usr.getYear();
            notes = usr.getNotes();

        }
        Title      = "\n"     +
                "aps"                  +aps +"\n"+
                "university" +    university+"\n"+
                "programmes" +    programmes+"\n"+
                "faculty" +          faculty+"\n"+
                "careers" +          careers+"\n"+
                "requirements" +requirements+"\n"+
                "year" +                year+"\n"+
                "notes" +              notes;

        return Title;
    }
    private String applys(Context context)
    {
        String Title                    =""          ;
        String Initials                 =""             ;
        String First_Names              =""                ;
        String Surname                  =""            ;
        int    Birthdate                =0           ;
        int    Citizenship_Code         =0                  ;
        int    ID__Passport_Number      =0                     ;
        String Gender                   =""           ;
        String Marital_Status           =""                   ;
        String Home_Language            =""                  ;
        String Population_Group         =""                     ;
        String Prefered_Language        =""                      ;
        String Address_Line_1           =""                   ;
        String Address_Line_2           =""                   ;
        String City_Town                =""              ;
        String Province                 =""             ;
        int    Postal_Code               =0             ;
        String Residence_Accommodation  =""                            ;
        int    Cell_Phone                 =0            ;
        String Email                    =""          ;
        String Maiden_Names             =""                 ;
        String Activity_Last_Year       =""                       ;
        String Highest_Grade_Passed     =""                         ;
        String Senior_Secondary_School  =""                            ;
        int    Matric_Date               =0             ;
        String Matriculation_Type       =""                       ;
        apply = VisionDatabase.getDatabase(context).getSelect().getAppling();

        String Titlea ="";
        for(Applying usr : apply)
        {
            Title                     = usr.getTitle();
            Initials                  = usr.getInitials               ();
            First_Names               = usr.getFirst_Names            ();
            Surname                   = usr.getSurname                ();
            Birthdate                 = usr.getBirthdate              ();
            Citizenship_Code          = usr.getCitizenship_Code       ();
            ID__Passport_Number       = usr.getID__Passport_Number    ();
            Gender                    = usr.getGender                 ();
            Marital_Status            = usr.getMarital_Status         ();
            Home_Language             = usr.getHome_Language          ();
            Population_Group          = usr.getPopulation_Group       ();
            Prefered_Language         = usr.getPrefered_Language      ();
            Address_Line_1            = usr.getAddress_Line_1         ();
            Address_Line_2            = usr.getAddress_Line_2         ();
            City_Town                 = usr.getCity_Town              ();
            Province                  = usr.getProvince               ();
            Postal_Code               = usr.getPostal_Code            ();
            Residence_Accommodation   = usr.getResidence_Accommodation();
            Cell_Phone                = usr.getCell_Phone              ();
            Email                     = usr.getEmail                  ();
            Maiden_Names              = usr.getMaiden_Names           ();
            Activity_Last_Year        = usr.getActivity_Last_Year     ();
            Highest_Grade_Passed      = usr.getHighest_Grade_Passed   ();
            Senior_Secondary_School   = usr.getSenior_Secondary_School();
            Matric_Date               = usr.getMatric_Date            ();
            Matriculation_Type        = usr.getMatriculation_Type     ();

        }
        Titlea = "\n" +
                "\n Title                    "  +Title                     +
                "\n Initials                 "  +Initials                  +
                "\n First_Names              "  +First_Names               +
                "\n Surname                  "  +Surname                   +
                "\n Birthdate                "  +Birthdate                 +
                "\n Citizenship_Code         "  +Citizenship_Code          +
                "\n ID__Passport_Number      "  +ID__Passport_Number       +
                "\n Gender                   "  +Gender                    +
                "\n Marital_Status           "  +Marital_Status            +
                "\n Home_Language            "  +Home_Language             +
                "\n Population_Group         "  +Population_Group          +
                "\n Prefered_Language        "  +Prefered_Language         +
                "\n Address_Line_1           "  +Address_Line_1            +
                "\n Address_Line_2           "  +Address_Line_2            +
                "\n City_Town                "  +City_Town                 +
                "\n Province                 "  +Province                  +
                "\n Postal_Code              "  +Postal_Code               +
                "\n Residence_Accommodation  "  +Residence_Accommodation   +
                "\n Cell_Phone               "  +Cell_Phone                +
                "\n Email                    "  +Email                     +
                "\n Maiden_Names             "  +Maiden_Names              +
                "\n Activity_Last_Year       "  +Activity_Last_Year        +
                "\n Highest_Grade_Passed     "  +Highest_Grade_Passed      +
                "\n Senior_Secondary_School  "  +Senior_Secondary_School   +
                "\n Matric_Date              "  +Matric_Date               +
                "\n Matriculation_Type       "  +Matriculation_Type      ;
        return Titlea;
    }

    public String generatePDF1(Context context) {
        String home = "";
        String username             ="";
        int    maths       =0          ;
        int    english     =0            ;
        int    lo          =0           ;
        int    language    =0         ;
        int    subject1    =0         ;
        int    subject2    =0         ;
        int    subject3    =0         ;
        int    fomula1     =0        ;
        int    fomula2     =0        ;
        int    fomula3     =0        ;
        Double fomula4     =0.0        ;
        int    fomula5     =0        ;
        int    fomula6     =0        ;
        int    fomula7     =0        ;
        int    fomula8     =0        ;
        String institution =""        ;
        String country     =""        ;
        String sub1        =""         ;
        String sub2        =""         ;
        String sub3        =""         ;
        String lang        =""         ;
        int    staring     =0         ;
        String uni         ="" ;
        String type        =""  ;
        student = VisionDatabase.getDatabase(context).getSelect().getStudent();
        for(Student usr : student)
        {
            username = usr.getUsername();
            maths = usr.getMaths();
            english = usr.getEnglish();
            lo = usr.getLo();
            language = usr.getLanguage();
            subject1 = usr.getSubject1();
            subject2 = usr.getSubject2();
            subject3 = usr.getSubject3();

            fomula1 = usr.getFomula1();
            fomula2 = usr.getFomula2();
            fomula3 = usr.getFomula3();
            fomula4 = usr.getFomula4();
            fomula5 = usr.getFomula5();
            fomula6 = usr.getFomula6();
            fomula7 = usr.getFomula7();
            fomula8 = usr.getFomula8();

            institution = usr.getInstitution();
            country = usr.getCountry();
            sub1 = usr.getSub1();
            sub2 = usr.getSub2();
            sub3 = usr.getSub3();
            lang = usr.getLang();
            staring = usr.getStaring();
            uni = usr.getUni();
            type = usr.getType();

        }
        home   =
                "Username "+username +"\n" +
                        "\n" +
                        "Subjects: \n" +
                        "\n " +
                        "maths       " +maths      +"\n"+
                        "english     " +english    +"\n"+
                        "lo          " +lo         +"\n"+
                        "language    " +language   +"\n"+
                        "subject1    " +subject1   +"\n"+
                        "subject2    " +subject2   +"\n"+
                        "subject3    " +subject3   +"\n"+


                        "Username "+username +"\n" +
                        "Subjects: \n" +
                        "maths       " +maths      +"\n"+
                        "english     " +english    +"\n"+
                        "lo          " +lo         +"\n"+
                        "language    " +language   +"\n"+

                        "subject1     " +subject1    +"\n                   "+
                        "fomula8     " +fomula8    +"\n"+
                        "institution " +institution+"\n"+
                        "country     " +country    +"\n"+
                        "sub1        " +sub1       +"\n"+
                        "sub2        " +sub2       +"\n"+
                        "sub3        " +sub3       +"\n"+
                        "lang        " +lang       +"\n"+
                        "staring     " +staring    +"\n"+
                        "uni         " +uni        +"\n"+
                        "type        " +type      ;


        return home;      }

    public String generatePDF2(Context context) {
        String home = "";
        String username             ="";
        int    maths       =0          ;
        int    english     =0            ;
        int    lo          =0           ;
        int    language    =0         ;
        int    subject1    =0         ;
        int    subject2    =0         ;
        int    subject3    =0         ;
        int    fomula1     =0        ;
        int    fomula2     =0        ;
        int    fomula3     =0        ;
        Double fomula4     =0.0        ;
        int    fomula5     =0        ;
        int    fomula6     =0        ;
        int    fomula7     =0        ;
        int    fomula8     =0        ;
        String institution =""        ;
        String country     =""        ;
        String sub1        =""         ;
        String sub2        =""         ;
        String sub3        =""         ;
        String lang        =""         ;
        int    staring     =0         ;
        String uni         ="" ;
        String type        =""  ;
        student = VisionDatabase.getDatabase(context).getSelect().getStudent();
        for(Student usr : student)
        {
            username = usr.getUsername();
            maths = usr.getMaths();
            english = usr.getEnglish();
            lo = usr.getLo();
            language = usr.getLanguage();
            subject1 = usr.getSubject1();
            subject2 = usr.getSubject2();
            subject3 = usr.getSubject3();

            fomula1 = usr.getFomula1();
            fomula2 = usr.getFomula2();
            fomula3 = usr.getFomula3();
            fomula4 = usr.getFomula4();
            fomula5 = usr.getFomula5();
            fomula6 = usr.getFomula6();
            fomula7 = usr.getFomula7();
            fomula8 = usr.getFomula8();

            institution = usr.getInstitution();
            country = usr.getCountry();
            sub1 = usr.getSub1();
            sub2 = usr.getSub2();
            sub3 = usr.getSub3();
            lang = usr.getLang();
            staring = usr.getStaring();
            uni = usr.getUni();
            type = usr.getType();

        }
        home   =
                "Username "+username +"\n" +
                        "\n" +
                        "Subjects: \n" +
                        "\n " +
                        "maths      " +maths      +"\n"+
                        "english    " +english    +"\n"+
                        "lo         " +lo         +"\n"+
                        "language   " +language   +"\n"+
                        "subject1   " +subject1   +"\n"+
                        "subject2   " +subject2   +"\n"+
                        "subject3   " +subject3   +"\n"+
//////////////////////////////////////////////////////////////////////

                        "subject2  "+subject2 +":\n" +
                        "subject3 "+subject3  +":\n" +
                        "           " +"  "  +":\n"+
                        "           " +"  "  +":\n"+
                        "           " +"  "  +":\n"+
                        "           " +"  "  +":\n"+

                        "           " +"  "  +":\n                       "+
 //////////////////////////////////////////////////////////////////////
                        "fomula8    " +fomula8    +"\n"+
                        "institution" +institution+"\n"+
                        "country    " +country    +"\n"+
                        "sub1       " +sub1       +"\n"+
                        "sub2       " +sub2       +"\n"+
                        "sub3       " +sub3       +"\n"+
                        "lang       " +lang       +"\n"+
                        "staring    " +staring    +"\n"+
                        "uni        " +uni        +"\n"+
                        "type       " +type      ;





    return home;      }  public String generatePDF3(Context context) {

    String home = "";
    return home;}  public String generatePDF4(Context context) {

    String home = "";
    return home;}  public String generatePDF5(Context context) {

    String home = "";
    return home;}  public String generatePDF6(Context context) {

    String home = "";
    return home;}  public String generatePDF7(Context context) {

    String home = "";
    return home;}  public String generatePDF8(Context context) {

    String home = "";
    return home;}  public String generatePDF9(Context context) {

    String home = "";
    return home;}  public String generatePDF10(Context context) {

    String home = "";
    return home;}  public String generatePDF11(Context context) {

    String home = "";
    return home;}  public String generatePDF12(Context context) {

    String home = "";
    return home;}  public String generatePDF13(Context context) {

    String home = "";
    return home;}  public String generatePDF14(Context context) {

    String home = "";
    return home;}  public String generatePDF15(Context context) {

    String home = "";
    return home;}  public String generatePDF16(Context context) {

    String home = "";
    return home;}  public String generatePDF17(Context context) {

    String home = "";
    return home;}  public String generatePDF18(Context context) {

    String home = "";
    return home;}  public String generatePDF19(Context context) {

    String home = "";
    return home;}  public String generatePDF20(Context context) {

    String home = "";
    return home;}  public String generatePDF21(Context context) {

    String home = "";
    return home;}  public String generatePDF22(Context context) {

    String home = "";
    return home;}  public String generatePDF23(Context context) {

    String home ="";
    return home;} }

