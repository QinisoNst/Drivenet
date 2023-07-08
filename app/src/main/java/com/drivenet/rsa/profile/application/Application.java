package com.drivenet.rsa.profile.application;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Applying;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.Student.coursepicker;
import com.drivenet.rsa.database.database.VisionDatabase;
import com.drivenet.rsa.profile.Courseoption.Adapter.CourseAdapter;
import com.drivenet.rsa.profile.application.Adapter.ApplicationAdapter;
import com.drivenet.rsa.profile.application.Adapter.ApplicationItem;

import java.util.ArrayList;
import java.util.List;

public class Application extends Fragment
{
    private List<coursepicker> mExampleList;
    private RecyclerView mRecyclerView;
    private CourseAdapter mAdapter;
    private List<Student> students;
    private List<Applying> students1;
    private ArrayList<ApplicationItem> mExampleList1;
    private RecyclerView mRecyclerView1;
    private ApplicationAdapter mAdapter1;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile1 , container , false);

        createExampleList();
        buildRecyclerView1(view);
        buildRecyclerView(view);
        return view;
    }
    private void buildRecyclerView(View view)
    {
        students = VisionDatabase.getDatabase(getContext()).getSelect().getStudent();
        int name =0;
        for(Student usr : students)
        {
            name = usr.getFomula7();
        }
        mExampleList =  VisionDatabase.getDatabase(getContext()).getSelect().getcoursepicker();
        mRecyclerView = view.findViewById(R.id.RecyclerView1);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new CourseAdapter(getContext(),mExampleList,name);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
    private void createExampleList()
    {
        students1 = VisionDatabase.getDatabase(getContext()).getSelect().getAppling1();

        String Initials = "";
        String First_Names = "";
        String Surname = "" ;
        int    Birthdate = 0;
        int    Citizenship_Code = 0;
        int    ID__Passport_Number = 0;
        String Gender= "";
        String Marital_Status = "";
        String Home_Language= "" ;
        String Population_Group = "";
        String Prefered_Language = "";
        String Address_Line_1 = "" ;
        String Address_Line_2 = "";
        String City_Town = "";
        String Province = "";
        int    Postal_Code = 0;
        String Residence_Accommodation = "";
        int    Cell_Phone =0;
        String Email = "";
        String Maiden_Names = "";
        String Activity_Last_Year = "";
        String Highest_Grade_Passed = "";
        String Senior_Secondary_School = "";
        int    Matric_Date =0;
        String Matriculation_Type = "";

        for(Applying usr : students1) {
            Initials = usr.getInitials();
            First_Names = usr.getFirst_Names();
            Surname = usr.getSurname();
            Birthdate = usr.getBirthdate();
            Citizenship_Code = usr.getCitizenship_Code();
            ID__Passport_Number = usr.getID__Passport_Number();
            Gender = usr.getGender();
            Marital_Status = usr.getMarital_Status();
            Home_Language = usr.getHome_Language();
            Population_Group = usr.getPopulation_Group();
            Prefered_Language = usr.getPrefered_Language();
            Address_Line_1 = usr.getAddress_Line_1();
            Address_Line_2 = usr.getAddress_Line_2();
            City_Town = usr.getCity_Town();
            Province = usr.getGender();
            Postal_Code = usr.getPostal_Code();
            Residence_Accommodation = usr.getResidence_Accommodation();
            Cell_Phone = usr.getCell_Phone();
            Email = usr.getEmail();
            Maiden_Names = usr.getMaiden_Names();
            Activity_Last_Year = usr.getActivity_Last_Year();
            Highest_Grade_Passed = usr.getHighest_Grade_Passed();
            Senior_Secondary_School = usr.getSenior_Secondary_School();
            Matric_Date = usr.getMatric_Date();
            Matriculation_Type = usr.getMatriculation_Type();
        }
             mExampleList1 = new ArrayList<>();
             mExampleList1.add(new ApplicationItem("Initials",Initials));
             mExampleList1.add(new ApplicationItem("First_Names" , First_Names));
             mExampleList1.add(new ApplicationItem("Surname" , Surname));
             mExampleList1.add(new ApplicationItem("Birthdate" , Birthdate+""));
             mExampleList1.add(new ApplicationItem("Citizenship_Code" , Citizenship_Code+""));
             mExampleList1.add(new ApplicationItem("ID__Passport_Number" , ID__Passport_Number+""));
             mExampleList1.add(new ApplicationItem("Gender" , Gender));
             mExampleList1.add(new ApplicationItem("Marital_Status" , Marital_Status));
             mExampleList1.add(new ApplicationItem("Home_Language" , Home_Language));
             mExampleList1.add(new ApplicationItem("Population_Group" , Population_Group));
             mExampleList1.add(new ApplicationItem("Prefered_Language" , Prefered_Language));
             mExampleList1.add(new ApplicationItem("Address_Line_1" , Address_Line_1));
             mExampleList1.add(new ApplicationItem("Address_Line_2" , Address_Line_2));
             mExampleList1.add(new ApplicationItem("City_Town" , City_Town));
             mExampleList1.add(new ApplicationItem("Province" , Province));
             mExampleList1.add(new ApplicationItem("Postal_Code" , Postal_Code+""));
             mExampleList1.add(new ApplicationItem("Residence_Accommodation" , Residence_Accommodation));
             mExampleList1.add(new ApplicationItem("Cell_Phone" , Cell_Phone+""));
             mExampleList1.add(new ApplicationItem("Email" , Email));
             mExampleList1.add(new ApplicationItem("Maiden_Names" , Maiden_Names));
             mExampleList1.add(new ApplicationItem("Activity_Last_Year" , Activity_Last_Year));
             mExampleList1.add(new ApplicationItem("Highest_Grade_Passed" , Highest_Grade_Passed));
             mExampleList1.add(new ApplicationItem("Senior_Secondary_School" , Senior_Secondary_School));
             mExampleList1.add(new ApplicationItem("Matric_Date" , Matric_Date+""));
             mExampleList1.add(new ApplicationItem("Matriculation_Type" , Matriculation_Type));

    }

    private void buildRecyclerView1(View view) {
        mRecyclerView1 = view.findViewById(R.id.RecyclerView);
        mRecyclerView1.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter1 = new ApplicationAdapter(mExampleList1, getContext());
        mRecyclerView1.setLayoutManager(mLayoutManager);
        mRecyclerView1.setAdapter(mAdapter1);
    }
}