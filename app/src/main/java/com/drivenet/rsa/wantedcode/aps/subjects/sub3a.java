package com.drivenet.rsa.wantedcode.aps.subjects;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Student;

import com.drivenet.rsa.wantedcode.aps.subjects.sub3.sub3Adapter1;
import com.drivenet.rsa.wantedcode.aps.subjects.sub3.sub3Item1;


import java.util.ArrayList;
import java.util.List;

public class sub3a extends Fragment {
    private ArrayList<sub3Item1> mExampleList;
    private RecyclerView mRecyclerView;
    private sub3Adapter1 mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Student> students;
    private MainActivity mainActivity = new MainActivity();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
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
        return view;
    }

    private void filter(String text) {
        ArrayList<sub3Item1> filteredList = new ArrayList<>();
        for (sub3Item1 item : mExampleList) {
            if (item.getmText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        mAdapter.filterList(filteredList);
    }

    private void createExampleList()
    {
        mExampleList = new ArrayList<>();
        mExampleList.add(new sub3Item1("Accounting" ));
        mExampleList.add(new sub3Item1("Agricultural Management Practices"));
        mExampleList.add(new sub3Item1("Agricultural Sciences"));
        mExampleList.add(new sub3Item1("Agricultural Technology"));
        mExampleList.add(new sub3Item1("Business Studies"));
        mExampleList.add(new sub3Item1("Civil Technology"));
        mExampleList.add(new sub3Item1("Computer Course Technology"));
        mExampleList.add(new sub3Item1("Consumer Studies"));
        mExampleList.add(new sub3Item1("Dance studies"));
        mExampleList.add(new sub3Item1("Design"));
        mExampleList.add(new sub3Item1("Dramatic Arts"));
        mExampleList.add(new sub3Item1("Economics"));
        mExampleList.add(new sub3Item1("Electrical Technology"));
        mExampleList.add(new sub3Item1("Engineering Graphic and Design"));
        mExampleList.add(new sub3Item1("Geography"));
        mExampleList.add(new sub3Item1("History"));
        mExampleList.add(new sub3Item1("Hospitality Studies"));
        mExampleList.add(new sub3Item1("Information Technology"));
        mExampleList.add(new sub3Item1("Life Sciences"));
        mExampleList.add(new sub3Item1("Mechanical Technology"));
        mExampleList.add(new sub3Item1("Physical Sciences"));
        mExampleList.add(new sub3Item1("Religion Studies"));
        mExampleList.add(new sub3Item1("Music"));
        mExampleList.add(new sub3Item1("Technical Sciences"));
        mExampleList.add(new sub3Item1("Tourism"));
        mExampleList.add(new sub3Item1("Visual Arts"));
    }

    private void buildRecyclerView(View view) {
        mRecyclerView = view.findViewById(R.id.listview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new sub3Adapter1(mExampleList,getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
   


    @Override
    public void onResume() {
        super.onResume();
        mainActivity.hideBottomNav();
        mainActivity.hidetoolbar();
  //      requireActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    @Override
    public void onStop() {
        super.onStop();
        mainActivity.showBottomNav();
        mainActivity.showtoolbar();
   //     requireActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


}