package com.drivenet.rsa.profile.Courseoption;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.Student.coursepicker;
import com.drivenet.rsa.database.database.VisionDatabase;
import com.drivenet.rsa.profile.Courseoption.Adapter.CourseAdapter;

import java.util.List;

public class Course extends Fragment {
    private List<coursepicker> mExampleList;
    private RecyclerView mRecyclerView;
    private CourseAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Student> students;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_get_data, container, false);

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

        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new CourseAdapter(getContext(),mExampleList,name);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

}