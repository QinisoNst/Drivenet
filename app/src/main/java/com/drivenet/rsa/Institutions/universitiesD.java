package com.drivenet.rsa.Institutions;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.database.VisionDatabase;

import com.drivenet.rsa.Institutions.adapter.Province;


import com.drivenet.rsa.home.adapter.ExampleAdapter1;
import com.drivenet.rsa.home.adapter.ExampleItem1;

import java.util.ArrayList;
import java.util.List;

public class universitiesD extends Fragment{
    private RecyclerView list;
    private ArrayList<Province> arraylist = new ArrayList<Province>();
    private TextView insti;
    private List<Student> students;


    private ArrayList<ExampleItem1> mExampleList;
    private RecyclerView mRecyclerView;
    private ExampleAdapter1 mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater , @Nullable ViewGroup container , @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_institutions, container, false);
        createExampleList();
        buildRecyclerView(view);

        EditText editText = view.findViewById(R.id.edittext);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });

        insti = (TextView)view.findViewById(R.
                id.textView);


        list = (RecyclerView)view.findViewById(R.id.listview);

        return view;
    }

    private void filter(String text) {
        ArrayList<ExampleItem1> filteredList = new ArrayList<>();
        for (ExampleItem1 item : mExampleList) {
            if (item.getText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        mAdapter.filterList(filteredList);
    }

    private void createExampleList()
    {
        students = VisionDatabase.getDatabase(getContext()).getSelect().getStudent();

     //   String country="";
     ///   for(Student usr : students)
    //    {
     //       country = usr.getCountry();
     //   }
     //   if(country.equals("South Africa"))
     //   {
            mExampleList = new ArrayList<>();
            mExampleList.add(new ExampleItem1("Western Cape"));
            mExampleList.add(new ExampleItem1("Gauteng"));
            mExampleList.add(new ExampleItem1("KwaZulu-Natal"));
            mExampleList.add(new ExampleItem1("Eastern Cape"));
            mExampleList.add(new ExampleItem1("Northern Cape"));
            mExampleList.add(new ExampleItem1("Limpopo"));
            mExampleList.add(new ExampleItem1("Mpumalanga"));
            mExampleList.add(new ExampleItem1("North West"));
            mExampleList.add(new ExampleItem1("Free State"));
        //}
    }

    private void buildRecyclerView(View view) {
        mRecyclerView = view.findViewById(R.id.listview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new ExampleAdapter1(mExampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
    }
