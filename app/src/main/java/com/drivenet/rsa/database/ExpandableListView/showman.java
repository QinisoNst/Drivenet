package com.drivenet.rsa.database.ExpandableListView;


import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.Student.courseholder;
import com.drivenet.rsa.database.Student.coursepicker;
import com.drivenet.rsa.database.database.VisionDatabase;
import com.drivenet.rsa.homefragments.HomeFragment1;
import com.drivenet.rsa.profile.Profile;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class showman extends Fragment {

    private LinkedHashMap<String, GroupInfo> subjects = new LinkedHashMap<String, GroupInfo>();
    private ArrayList<GroupInfo> deptList = new ArrayList<GroupInfo>();
    private setmegetme set =new setmegetme();
    private CustomAdapter listAdapter;
    private ExpandableListView simpleExpandableListView;
    private LinkedHashMap<String, GroupInfo1> subjects1 = new LinkedHashMap<String, GroupInfo1>();
    private ArrayList<GroupInfo1> deptList1 = new ArrayList<GroupInfo1>();
    private CustomAdapter1 listAdapter1;
    private ExpandableListView simpleExpandableListView1;
    private List<Student> student;
    private List<coursepicker> course;
    private LinkedHashMap<String, GroupInfo2> subjects2 = new LinkedHashMap<String, GroupInfo2>();
    private ArrayList<GroupInfo2> deptList2 = new ArrayList<GroupInfo2>();
    private CustomAdapter2 listAdapter2;
    private ExpandableListView simpleExpandableListView2;
    private Button button;
    private TextView Programmes,Aps,University,MyAps;
    private List<courseholder> courseholdera;
    private String[] institutionNames = {"Select Option","1st Option", "2st Option", "3rd Option"};
    private Spinner spin1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_uni_layout1, container, false);

        courseholdera = VisionDatabase.getDatabase(getContext()).getSelect().getcourseholder();
        final spinnerAdapter1 customAdapter1 = new spinnerAdapter1(getActivity(),institutionNames);

        spin1 = (Spinner) view.findViewById(R.id.simpleSpinner2);

        button = (Button) view.findViewById(R.id.done);

        spin1.setAdapter(customAdapter1);

        reload();
        String programmes =" ";
        String careers = "";
        String faculty ="";
        String notes = "";
        String requirements ="";
        String university = "";
        String aps ="";
        String year ="";
        String myaps ="";

        for(courseholder usr : courseholdera)
        {
            programmes = usr.getProgrammes();
            careers = usr.getCareers();
            faculty = usr.getFaculty();
            notes = usr.getNotes();
            requirements = usr.getRequirements();
            university = usr.getUniversity();
            myaps = usr.getMyaps()+"";
            year = usr.getYear()+"";
            aps = usr.getAps()+"";
        }

        Programmes = view.findViewById(R.id.Programmes);
        Aps = view.findViewById(R.id.Aps);
        University = view.findViewById(R.id.University);
        MyAps = view.findViewById(R.id.MyAps);

        Programmes.setText(programmes);
        Aps.setText(aps);
        University.setText(university);
        MyAps.setText(myaps);

        loadData(careers,requirements,notes);

        simpleExpandableListView = (ExpandableListView) view.findViewById(R.id.simpleExpandableListView);
        listAdapter = new CustomAdapter(getContext(), deptList);
        simpleExpandableListView.setAdapter(listAdapter);

        simpleExpandableListView1 = (ExpandableListView) view.findViewById(R.id.simpleExpandableListView1);
        listAdapter1 = new CustomAdapter1(getContext(), deptList1);
        simpleExpandableListView1.setAdapter(listAdapter1);
        student = VisionDatabase.getDatabase(getContext()).getSelect().getStudent();

        simpleExpandableListView2 = (ExpandableListView) view.findViewById(R.id.simpleExpandableListView2);
        listAdapter2 = new CustomAdapter2(getContext(), deptList2);
        simpleExpandableListView2.setAdapter(listAdapter2);

        expandAll();

        simpleExpandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener()
        {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
               // GroupInfo headerInfo = deptList.getProfile(groupPosition);
               // ChildInfo detailInfo =  headerInfo.getProductList().getProfile(childPosition);

                return false;
            }
        });

        String finalAps = aps;
        String finalUniversity = university;
        String finalProgrammes = programmes;
        String finalFaculty = faculty;
        String finalCareers = careers;
        String finalYear = year;
        String finalNotes = notes;
        String finalRequirements = requirements;
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent , View view , int position , long id) {
                //Toast.makeText(getContext(), institutionNames[position], Toast.LENGTH_LONG).show();

                if (institutionNames[position].equals("1st Option"))
                {
                    VisionDatabase.getDatabase(getContext()).getUpdate().picker(Integer.parseInt(finalAps),finalUniversity,finalProgrammes,finalFaculty,finalCareers, finalRequirements ,Integer.parseInt(finalYear),finalNotes,1);
                }
                    else if (institutionNames[position].equals("2st Option"))
                {
                    VisionDatabase.getDatabase(getContext()).getUpdate().picker(Integer.parseInt(finalAps),finalUniversity,finalProgrammes,finalFaculty,finalCareers, finalRequirements ,Integer.parseInt(finalYear),finalNotes,2);

                }
                else if (institutionNames[position].equals("3rd Option"))
                {
                    VisionDatabase.getDatabase(getContext()).getUpdate().picker(Integer.parseInt(finalAps),finalUniversity,finalProgrammes,finalFaculty,finalCareers, finalRequirements ,Integer.parseInt(finalYear),finalNotes,3);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                course = VisionDatabase.getDatabase(getContext()).getSelect().getcoursepickerw(3);
                if(!home2().equals(""))
                {
                    if(home1().equals("Applying"))
                    {
                        reload3();
                        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container , new Profile()).addToBackStack(null).commit();
                    }
                else
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container , new HomeFragment1()).addToBackStack(null).commit();
                }
            }else
                {
                    reload2();
                }}
        });
        return view;
    }
    private void loadData(String careers,String requirements,String notes){

        addProduct("Minimum Admission Requirements",requirements);

        addProduct1("Careers",careers);

        addProduct2("Notes",notes);
    }

    private void expandAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++){
            simpleExpandableListView.expandGroup(i);
        }
    }
    private int addProduct2(String department, String product){

        int groupPosition = 0;

        GroupInfo2 headerInfo = subjects2.get(department);

        if(headerInfo == null){
            headerInfo = new GroupInfo2();
            headerInfo.setName(department);
            subjects2.put(department, headerInfo);
            deptList2.add(headerInfo);
        }

        ArrayList<ChildInfo2> productList = headerInfo.getProductList();
        int listSize = productList.size();

        listSize++;

        ChildInfo2 detailInfo = new ChildInfo2();
        detailInfo.setSequence(String.valueOf(listSize));
        detailInfo.setName(product);
        productList.add(detailInfo);
        headerInfo.setProductList(productList);

        groupPosition = deptList2.indexOf(headerInfo);
        return groupPosition;
    }

    private int addProduct(String department, String product){

        int groupPosition = 0;

        GroupInfo headerInfo = subjects.get(department);

        if(headerInfo == null){
            headerInfo = new GroupInfo();
            headerInfo.setName(department);
            subjects.put(department, headerInfo);
            deptList.add(headerInfo);
        }

        ArrayList<ChildInfo> productList = headerInfo.getProductList();
        int listSize = productList.size();

        listSize++;

        ChildInfo detailInfo = new ChildInfo();
        detailInfo.setSequence(String.valueOf(listSize));
        detailInfo.setName(product);
        productList.add(detailInfo);
        headerInfo.setProductList(productList);

        groupPosition = deptList.indexOf(headerInfo);
        return groupPosition;
    }

    private int addProduct1(String department, String product){

        int groupPosition = 0;

        GroupInfo1 headerInfo = subjects1.get(department);

        if(headerInfo == null){
            headerInfo = new GroupInfo1();
            headerInfo.setName(department);
            subjects1.put(department, headerInfo);
            deptList1.add(headerInfo);
        }

        ArrayList<ChildInfo1> productList = headerInfo.getProductList();
        int listSize = productList.size();

        listSize++;

        ChildInfo1 detailInfo = new ChildInfo1();
        detailInfo.setSequence(String.valueOf(listSize));
        detailInfo.setName(product);
        productList.add(detailInfo);
        headerInfo.setProductList(productList);

        groupPosition = deptList1.indexOf(headerInfo);
        return groupPosition;
    }
    private void reload()
    {
        course = VisionDatabase.getDatabase(getContext()).getSelect().getcoursepickerw(3);

        if(home2().equals("")){
        androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(
                getContext()
        );
        //Setting AlertDialog's Icon ,Title and Message
        builder.setIcon(R.drawable.icon);
        builder.setTitle("Courses !!!");
        builder.setMessage("Please note you will have to select option for the course you picking and you will only click done once you have picked 3 option");
        //set NegativeButton so that if anyone clicks yes it will cancel the whole AlertDialog
        builder.setNegativeButton("OK" , new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog , int which) {
                dialog.cancel();
            }
        });
        //creating  alertDialog to show AlertDialog
        androidx.appcompat.app.AlertDialog alertDialog = builder.create();
        alertDialog.show();}}
    private void reload2()
    {

            androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(
                    getContext()
            );
            //Setting AlertDialog's Icon ,Title and Message
            builder.setIcon(R.drawable.icon);
            builder.setTitle("Error !!!");
            builder.setMessage("Please ensure that you select all three options");
            //set NegativeButton so that if anyone clicks yes it will cancel the whole AlertDialog
            builder.setNegativeButton("OK" , new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog , int which) {
                    dialog.cancel();
                }
            });
            //creating  alertDialog to show AlertDialog
            androidx.appcompat.app.AlertDialog alertDialog = builder.create();
            alertDialog.show();}
    private void reload3()
    {

        androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(
                getContext()
        );
        //Setting AlertDialog's Icon ,Title and Message
        builder.setIcon(R.drawable.icon);
        builder.setTitle("Profile !!!");
        builder.setMessage("If you wish to view your Application and course\n" +
                "print is to used to print your profile before you submit\n" +
                "submit sends the profile to our computers so we can apply for you");
        //set NegativeButton so that if anyone clicks yes it will cancel the whole AlertDialog
        builder.setNegativeButton("OK" , new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog , int which) {
                dialog.cancel();
            }
        });
        //creating  alertDialog to show AlertDialog
        androidx.appcompat.app.AlertDialog alertDialog = builder.create();
        alertDialog.show();}
    private String home1()
    {
        String Title =" ";
        for(Student usr : student)
        {
            Title = usr.getType();
        }
   //     Toast.makeText( getContext(), Title, Toast.LENGTH_LONG).show();

        return Title;
    }
    private String home2()
    {
        String Title =" ";
        for(coursepicker usr : course)
        {
            Title = usr.getRequirements();
        }
        //        Toast.makeText( getContext(), Title, Toast.LENGTH_LONG).show();

        return Title;
    }
}