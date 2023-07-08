package com.drivenet.rsa.wantedcode.aps.showaps.port.wc.uwc;

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

import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.database.VisionDatabase;

import com.drivenet.rsa.database.uni.wc.uwc.uwc;


import java.util.ArrayList;
import java.util.List;

public class showUwc extends Fragment {
    private List<uwc> mExampleList;
    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Student> students;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_get_data, container, false);


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

    private void filter(String text)
    {
        ArrayList<uwc> filteredList = new ArrayList<>();
        for (uwc item : mExampleList) {
            if (item.getProgrammes().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        mAdapter.filterList(filteredList);
    }

    private void buildRecyclerView(View view)
    {
        students = VisionDatabase.getDatabase(getContext()).getSelect().getStudent();
        int name =0;
        for(Student usr : students)
        {
            name = usr.getFomula5();
        }

        mExampleList =  VisionDatabase.getDatabase(getContext()).getSelect().getapsuwc(name);

        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new ExampleAdapter(getContext(),mExampleList,name);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

}